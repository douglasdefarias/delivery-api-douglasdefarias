package com.deliverytech.delivery_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
 
@Table(name = "ItemPedido")
public class ItemPedido 

{ 
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private int quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal subtotal; 
    private String observacao;
    
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
    
    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

      

    

}
