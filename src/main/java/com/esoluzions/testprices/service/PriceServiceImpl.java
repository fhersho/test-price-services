package com.esoluzions.testprices.service;

import com.esoluzions.testprices.entity.Price;
import com.esoluzions.testprices.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    @Override
    public List<Price> findAll() {
        return priceRepository.findAll();
    }
}
