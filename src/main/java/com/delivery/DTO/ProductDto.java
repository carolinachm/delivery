package com.delivery.DTO;

import com.delivery.entitie.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    public ProductDto(Product x) {
	}
	private String name;
    private Double price;
    private String description;
    private String imageUri;
    
}
