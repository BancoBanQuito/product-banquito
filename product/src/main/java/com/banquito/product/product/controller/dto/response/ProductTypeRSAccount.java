package com.banquito.product.product.controller.dto.response;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductTypeRSAccount implements Serializable {
    
        private String codeProductType;
        private String name;
        List<ProductRSAccount> specializations;     
    
}
