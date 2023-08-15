package com.unlockway.backendapplication.api.dto;

import com.unlockway.backendapplication.model.FoodModel;
import org.springframework.beans.BeanUtils;


public class FoodDTO {
    private int id;
    private String name;
    private String description;
    private String calories;
    private String proteins;
    private String water;
    private String minerals;
    private String vitamins;
    private String fats;

    public FoodDTO() {

    }

    public FoodDTO(FoodModel entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getProteins() {
        return proteins;
    }

    public void setProteins(String proteins) {
        this.proteins = proteins;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getMinerals() {
        return minerals;
    }

    public void setMinerals(String minerals) {
        this.minerals = minerals;
    }

    public String getVitamins() {
        return vitamins;
    }

    public void setVitamins(String vitamins) {
        this.vitamins = vitamins;
    }

    public String getFats() {
        return fats;
    }

    public void setFats(String fats) {
        this.fats = fats;
    }
}
