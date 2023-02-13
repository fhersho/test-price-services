package com.esoluzions.testprices.controller;

import com.esoluzions.testprices.entity.Price;
import com.esoluzions.testprices.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/api/price-services/v1/prices")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public List<Price> findAll(@RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        List prices = priceService.findAllByDate(date);
        return prices;
    }
}
