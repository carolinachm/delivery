package com.delivery.entitie;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.delivery.enums.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Table(name="tb_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private Double latitude;
    private Double longitude;
    private Instant moment;
    private OrderStatus status;
    private Double total;
    @ManyToMany
    @JoinTable(name = "tb_order_product" , 
        joinColumns = @JoinColumn(name="order_id"), 
        inverseJoinColumns = @JoinColumn(name="product_id"))
    private Set<Product> products = new HashSet<>();
    
}