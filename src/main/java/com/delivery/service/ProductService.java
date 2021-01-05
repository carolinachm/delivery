package com.delivery.service;

import java.util.List;
import java.util.stream.Collectors;

import com.delivery.DTO.ProductDto;
import com.delivery.entitie.Product;
import com.delivery.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDto> findAll(){
        List<Product> list = productRepository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDto(x)).collect(Collectors.toList());
    }
    
}
