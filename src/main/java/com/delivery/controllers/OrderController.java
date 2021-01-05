package com.delivery.controllers;

import java.util.List;

import com.delivery.DTO.OrderDto;
import com.delivery.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity <List<OrderDto> > listarTodos(){
        List<OrderDto> list = orderService.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}
