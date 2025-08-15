package com.deliverytech.delivery_api.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
 @Table(name = "pedido")   
public class Pedido {
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private long id;
  private String cliente;
  private String enderecoEntrega;
  private String status;
  private BigDecimal total;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
  private List<ItemPedido> itens;
  // @ManyToOne
  //   @JoinColumn(name = "restaurante_id")
  // private Restaurant restaurante;
  private LocalDateTime dataHoraPedido;
  private LocalDateTime dataHoraEntrega;
  private String observacao;
  private String formaPagamento;

   
    

    // Getters and Setters
  


}
