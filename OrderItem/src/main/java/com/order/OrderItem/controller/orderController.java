package com.order.OrderItem.controller;

import com.order.OrderItem.entity.order;
import com.order.OrderItem.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class orderController {

private orderService oService;

    @Autowired
    public orderController(orderService oService) {
        this.oService = oService;
    }

    @GetMapping("/orders")
    public List<order> findAll() {
        return  oService.findAll();
    }

    @GetMapping("/orders/{orderId}")
    public order findAll(@PathVariable int orderId) {
        order theOrder = oService.findById(orderId);
        if(theOrder == null) {
            throw new RuntimeException("emp Id not found -"+ orderId);
        }

        return theOrder;
    }

    @PostMapping("/orders")
    public order save(@RequestBody order theOrder) {

        theOrder.setId(0);
        oService.save(theOrder);

        return theOrder;
    }


    @PutMapping("/orders")
    public order update(@RequestBody order theOrder) {

        oService.save(theOrder);

        return theOrder;
    }
    @DeleteMapping("/orders/{orderId}")
    public String delete(@PathVariable int orderId) {

        oService.delete(orderId);

        return "Order with orderId -" +orderId + "  is deleted";
    }




}
