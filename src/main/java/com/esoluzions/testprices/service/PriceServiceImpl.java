package com.esoluzions.testprices.service;

import com.esoluzions.testprices.entity.Price;
import com.esoluzions.testprices.repository.PriceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    @Override
    public List<Price> findAll() {
        return priceRepository.findAll();
    }

    @Override
    public List<Price> findAllByDate(Date date) {
        List<Price> prices = priceRepository.findAll();
        if (date != null) {
            prices = prices.stream().filter(p ->
                    date.getTime() >= p.getStartDate().getTime() &&
                            date.getTime() <= p.getEndDate().getTime()).toList();
        }
        return prices;
    }
}
