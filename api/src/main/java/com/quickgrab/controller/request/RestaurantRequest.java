package com.quickgrab.controller.request;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RestaurantRequest {

    @NotEmpty
    private String name;

}
