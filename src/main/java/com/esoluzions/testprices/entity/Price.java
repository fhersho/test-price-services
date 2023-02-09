package com.esoluzions.testprices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "PRICES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BRAND_ID")
    private Long brandId;

    @Column(name = "START_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "END_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "PRICE_LIST")
    private Long priceList;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "PRIORITY")
    private Long priority;

    @Column(name = "PRICE")
    private BigInteger price;

    @Column(name = "CURRENCY")
    private String currency;

}
