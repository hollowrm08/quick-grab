package com.quickgrab.service.restaurant;

import com.quickgrab.controller.response.RestaurantResponse;
import com.quickgrab.domain.Restaurant;
import com.quickgrab.mapper.RestaurantMapper;
import com.quickgrab.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindRestaurantByIdService {

    @Autowired
    private RestaurantRepository repository;

    @Autowired
    private RestaurantMapper restaurantMapper;

    public RestaurantResponse findById(Integer id) {
        Optional<Restaurant> restaurant = repository.findById(id);
        if (restaurant.isEmpty()) throw new RuntimeException();

        return restaurantMapper.toResponse(restaurant.get());
    }
}
