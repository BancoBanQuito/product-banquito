package com.banquito.product.product.controller.dto.request;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InterestRateRQ implements Serializable {    
    private String name;
    private String type;
    private String calcBase;

}
