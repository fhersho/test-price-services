package com.esoluzions.testprices.controller;

import com.esoluzions.testprices.entity.Price;
import com.esoluzions.testprices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
@RequestMapping(value = "/api/price-services/v1/prices")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public List<Price> findAll() {
        List prices = priceService.findAll();
        return prices;
    }
}
