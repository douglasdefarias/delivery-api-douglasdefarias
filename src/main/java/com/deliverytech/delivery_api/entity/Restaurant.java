package com.deliverytech.delivery_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @Table(name = "restaurant")
 public class Restaurant {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private long id;
 
//     @Column(name = "name", nullable = false)
    private String name;    
     private String description;
//     @OneToMany(mappedBy = "restaurante")
//     private List<Produto> produtos;
}