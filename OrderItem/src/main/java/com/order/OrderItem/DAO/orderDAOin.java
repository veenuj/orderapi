package com.order.OrderItem.DAO;

import com.order.OrderItem.entity.order;

import java.util.List;

public interface orderDAOin {


    public List<order> findAll();

    public order findById(int theId);

    public void save(order theOrder);

    public void delete(int theId);



}
