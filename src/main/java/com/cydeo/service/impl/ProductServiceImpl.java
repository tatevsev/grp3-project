package com.cydeo.service.impl;

import com.cydeo.dto.ProductDto;
import com.cydeo.entity.Product;
import com.cydeo.repository.ProductRepository;
import com.cydeo.service.ProductService;
import com.cydeo.util.MapperUtil;
import com.cydeo.util.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final MapperUtil mapperUtil;


    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper, MapperUtil mapperUtil) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<ProductDto> listAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> mapperUtil.convert(product,new ProductDto())).collect(Collectors.toList());

    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product  = productRepository.findById(id).orElseThrow();
        return productMapper.convertToDto(product);
    }

    @Override
    public void create(ProductDto productDto) {
        Product product = productMapper.convertToEntity(productDto);
        productRepository.save(product);

    }

    @Override
    public void delete(Long id) {
        Optional<Product> foundProduct = productRepository.findById(id);

        if(foundProduct.isPresent()){
            foundProduct.get().setIsDeleted(true);
            productRepository.save(foundProduct.get());
        }

    }
    @Override
    public void edit(ProductDto product) {

        Product product1 = productRepository.findById(product.getId()).orElseThrow();

        Product convertedProduct = productMapper.convertToEntity(product);

        convertedProduct.setQuantityInStock(product1.getQuantityInStock());

        productRepository.save(convertedProduct);


    }

//    @Override
//    public List<ProductDto> getAllProductDetails() {
//
//
//        return List.of();
//    }

    //need help and keycloack here


}


