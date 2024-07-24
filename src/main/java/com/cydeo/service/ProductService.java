package com.cydeo.service;

import com.cydeo.dto.ProductDto;
import java.util.List;

public interface ProductService {
    List<ProductDto> listAllProducts();
    ProductDto getProductById(Long id);
    void create(ProductDto product);
    void delete(Long id);
    void edit(ProductDto product);
    List<ProductDto> getAllProductDetails();

}
