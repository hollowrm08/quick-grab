package com.quickgrab.service.restaurant;

import com.quickgrab.controller.request.RestaurantRequest;
import com.quickgrab.controller.response.RestaurantResponse;
import com.quickgrab.domain.Restaurant;
import com.quickgrab.mapper.RestaurantMapper;
import com.quickgrab.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveRestaurantService {

    @Autowired
    private RestaurantMapper mapper;

    @Autowired
    private RestaurantRepository repository;

    public RestaurantResponse save(RestaurantRequest request) {
        Restaurant restaurant = mapper.toDomain(request);
        restaurant = repository.save(repository.save(restaurant));
        return mapper.toResponse(restaurant);
    }

}
