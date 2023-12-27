package com.quickgrab.service.restaurant;

import com.quickgrab.domain.Restaurant;
import com.quickgrab.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllRestaurantsService {

    @Autowired
    private RestaurantRepository repository;

    public List<Restaurant> find() {
        return repository.findAll();
    }

}
