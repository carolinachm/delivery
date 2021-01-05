package com.delivery.service;

import java.util.List;
import java.util.stream.Collectors;

import com.delivery.DTO.OrderDto;
import com.delivery.entitie.Order;
import com.delivery.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional(readOnly = true)
    public List<OrderDto> findAll(){
        List<Order> list = orderRepository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDto(x)).collect(Collectors.toList());
    }
    
    
}
