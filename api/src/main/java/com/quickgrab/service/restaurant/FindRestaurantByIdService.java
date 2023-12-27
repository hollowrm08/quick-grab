package com.quickgrab.service.restaurant;

import com.quickgrab.domain.Restaurant;
import com.quickgrab.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindRestaurantByIdService {

    @Autowired
    private RestaurantRepository repository;

    public Restaurant findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
