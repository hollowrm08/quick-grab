package com.quickgrab.controller;

import com.quickgrab.controller.request.RestaurantRequest;
import com.quickgrab.controller.response.RestaurantResponse;
import com.quickgrab.service.restaurant.FindAllRestaurantsService;
import com.quickgrab.service.restaurant.FindRestaurantByIdService;
import com.quickgrab.service.restaurant.SaveRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    @Autowired
    private FindAllRestaurantsService findAllRestaurantsService;
    @Autowired
    private FindRestaurantByIdService findRestaurantByIdService;

    @Autowired
    private SaveRestaurantService saveRestaurantService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RestaurantResponse> findAllRestaurants() {
        return findAllRestaurantsService.find();
    }
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public RestaurantResponse findRestaurantById(@PathVariable Integer id) {
        return findRestaurantByIdService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RestaurantResponse saveRestaurant(@Valid @RequestBody RestaurantRequest request) {
        return saveRestaurantService.save(request);
    }

}
