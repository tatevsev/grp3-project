package com.cydeo.entity;

import com.cydeo.entity.common.BaseEntity;
import com.cydeo.enums.ProductUnit;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "products")
public class Product extends BaseEntity {


   private String name;

   private int quantityInStock;

   private int lowLimitAlert;

   @Enumerated(EnumType.STRING)
   private ProductUnit productUnit;

   @ManyToOne
   @JoinColumn(name = "category_id")
   private Category category;







}
