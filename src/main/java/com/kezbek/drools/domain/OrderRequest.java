package com.kezbek.drools.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderRequest {
    private String orderId;
    private String tierType;
    private Integer totalProduct;
    private Integer totalPrice;
    private Integer transactionCount;
    private Double discountTransaction = 0.0;
    private Double discountLoyalty = 0.0;
}
