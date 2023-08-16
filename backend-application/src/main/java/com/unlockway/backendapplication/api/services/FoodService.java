package com.unlockway.backendapplication.api.services;

import com.unlockway.backendapplication.api.dto.CreateFoodDTO;
import com.unlockway.backendapplication.api.dto.FoodDTO;
import com.unlockway.backendapplication.api.repositories.FoodRepository;
import com.unlockway.backendapplication.model.FoodModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    FoodRepository foodRepository;

    @Transactional(readOnly = true)
    public List<FoodDTO> findAll(){
        List<FoodModel> result = foodRepository.findAll();

        return result.stream().map(FoodDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<FoodDTO> findById(int id){
        List<FoodModel> result = foodRepository.findById(id);

        return result.stream().map(FoodDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public FoodDTO createFood(CreateFoodDTO createFoodDTO) {
        FoodModel newFood = new FoodModel();

        newFood.setName(createFoodDTO.getName());
        newFood.setDescription(createFoodDTO.getDescription());
        newFood.setCalories(createFoodDTO.getCalories());
        newFood.setProteins(createFoodDTO.getProteins());
        newFood.setWater(createFoodDTO.getWater());
        newFood.setMinerals(createFoodDTO.getMinerals());
        newFood.setVitamins(createFoodDTO.getVitamins());
        newFood.setFats(createFoodDTO.getFats());

        FoodModel savedFoodModel = foodRepository.save(newFood);
        return new FoodDTO(savedFoodModel);
    }
}
