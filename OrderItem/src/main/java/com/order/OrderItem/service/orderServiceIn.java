package com.order.OrderItem.service;

import com.order.OrderItem.entity.order;

import java.util.List;

public interface orderServiceIn {

    public List<order> findAll();

    public order findById(int theId);

    public void save(order theOrder);

    public void delete(int theId);

}
