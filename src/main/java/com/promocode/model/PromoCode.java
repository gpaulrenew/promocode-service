package com.promocode.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PromoCode {

    private Integer id;
    private String promoCode;
    private BigDecimal discount;
    private String expDate;

}
