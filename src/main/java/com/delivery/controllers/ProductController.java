package com.delivery.controllers;

import java.util.List;

import com.delivery.DTO.ProductDto;
import com.delivery.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
@CrossOrigin(origins = "*")
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity <List<ProductDto> > listarTodos(){
        List<ProductDto> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
