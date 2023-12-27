package com.quickgrab.mapper;

import com.quickgrab.controller.request.RestaurantRequest;
import com.quickgrab.controller.response.RestaurantResponse;
import com.quickgrab.domain.Restaurant;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RestaurantMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Restaurant toDomain(RestaurantRequest request) {
        return modelMapper.map(request, Restaurant.class);
    }

    public List<RestaurantResponse> toResponse(List<Restaurant> restaurants) {
        return restaurants.stream().map(this::toResponse).collect(Collectors.toList());
    }
    public RestaurantResponse toResponse(Restaurant restaurant) {
        return modelMapper.map(restaurant, RestaurantResponse.class);
    }

}
