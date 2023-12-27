package com.quickgrab.service.restaurant;

import com.quickgrab.controller.response.RestaurantResponse;
import com.quickgrab.domain.Restaurant;
import com.quickgrab.mapper.RestaurantMapper;
import com.quickgrab.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindAllRestaurantsService {

    @Autowired
    private RestaurantRepository repository;

    @Autowired
    private RestaurantMapper restaurantMapper;

    public List<RestaurantResponse> find() {
        List<Restaurant> restaurants = repository.findAll();
        return restaurantMapper.toResponse(restaurants);
    }

}
