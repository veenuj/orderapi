package com.order.OrderItem.service;

import com.order.OrderItem.DAO.orderDAO;
import com.order.OrderItem.entity.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class orderService implements orderServiceIn{

    private orderDAO orderlDAO;
    @Autowired
    public orderService(orderDAO ordersDAO) {
        this.orderlDAO = ordersDAO;
    }
    @Override
    @Transactional
    public List<order> findAll() {




        return orderlDAO.findAll();
    }

    @Override
    @Transactional
    public order findById(int theId) {
        return orderlDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(order theOrder) {
        orderlDAO.save(theOrder);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        orderlDAO.delete(theId);
    }
}
