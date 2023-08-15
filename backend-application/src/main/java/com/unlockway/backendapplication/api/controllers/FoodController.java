package com.unlockway.backendapplication.api.controllers;

import com.unlockway.backendapplication.api.dto.FoodDTO;
import com.unlockway.backendapplication.api.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    @GetMapping(value = "/data")
    public List<FoodDTO> findAll(){
        List<FoodDTO> result = foodService.findAll();

        return result;
    }
    @GetMapping(value = "/{id}")
    public List<FoodDTO> findById(@PathVariable int id){
        List<FoodDTO> result = foodService.findById(id);

        return result;
    }
}
