package com.esoluzions.testprices.service;

import com.esoluzions.testprices.entity.Price;

import java.util.Date;
import java.util.List;

public interface PriceService {
    public List<Price> findAll();

    public List<Price> findAllByDate(Date date);
}
