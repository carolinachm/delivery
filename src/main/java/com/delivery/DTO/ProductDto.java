package com.delivery.DTO;

import java.io.Serializable;

import com.delivery.entitie.Product;



public class ProductDto implements Serializable{

  
    private static final long serialVersionUID = 1L;
    private String name;
    private Double price;
    private String description;
    private String imageUri;


    public ProductDto() {
    }
    public ProductDto(String name, Double price, String description, String imageUri) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUri = imageUri;
    }

    public ProductDto(Product entity) {
       name = entity.getName();
        price = entity.getPrice();
        description = entity.getDescription();
        imageUri = entity.getImageUri();
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return this.imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

}

   