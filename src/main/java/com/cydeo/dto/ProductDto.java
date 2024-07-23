package com.cydeo.dto;

import com.cydeo.enums.ProductUnit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class ProductDto {

    private Long id;
    private String name;
    private Integer quantityInStock;
    private Integer lowLimitAlert;
    private ProductUnit productUnit;
    private CategoryDto category;
    private boolean hasProduct;

    public ProductDto(Long id, String name, Integer quantityInStock,
                      Integer lowLimitAlert, ProductUnit productUnit,
                      CategoryDto category, boolean hasProduct) {
        this.id = id;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.lowLimitAlert = lowLimitAlert;
        this.productUnit = productUnit;
        this.category = category;
        this.hasProduct = hasProduct;
    }
}
