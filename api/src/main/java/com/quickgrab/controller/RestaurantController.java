package com.quickgrab.controller;

import com.quickgrab.domain.Restaurant;
import com.quickgrab.service.restaurant.FindAllRestaurantsService;
import com.quickgrab.service.restaurant.FindRestaurantByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private FindAllRestaurantsService findAllRestaurantsService;
    @Autowired
    private FindRestaurantByIdService findRestaurantByIdService;


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Restaurant> findAllRestaurants() {
        return findAllRestaurantsService.find();
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Restaurant findRestaurantById(@PathVariable Integer id) {
        return findRestaurantByIdService.findById(id);
    }

}
