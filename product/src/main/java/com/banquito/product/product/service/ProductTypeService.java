package com.banquito.product.product.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banquito.product.product.model.ProductType;
import com.banquito.product.product.repository.ProductRepository;
import com.banquito.product.product.repository.ProductTypeRepository;

@Service
public class ProductTypeService {

    private final ProductTypeRepository productTypeRepository;
    private final ProductRepository productRepository;

    public ProductTypeService(ProductTypeRepository productTypeRepository, ProductRepository productRepository) {
        this.productTypeRepository = productTypeRepository;
        this.productRepository = productRepository;
    }

    public List<ProductType> findAll() {
        try {
            return productTypeRepository.findAll();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ProductType findById(String id) {
        try {
            return productTypeRepository.findById(id);

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public ProductType findByName(String name) {
        try {
            return productTypeRepository.findByName(name);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ResponseEntity<String> saveProductType(ProductType productType) {

        for (int i = 0; i < productType.getProducts().size(); i++) {
            if (productRepository.findById(productType.getProducts().get(i).getId()) == null) {
                return ResponseEntity.ok("Product not found");
            }
        }

        try {
            productTypeRepository.save(productType);
            return ResponseEntity.ok("Product type saved");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
