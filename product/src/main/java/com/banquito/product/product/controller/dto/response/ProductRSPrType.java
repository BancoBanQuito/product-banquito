package com.banquito.product.product.controller.dto.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductRSPrType implements Serializable {

    private String id;
    private String name;
    private String status;

}
