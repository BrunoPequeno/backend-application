package com.unlockway.backendapplication.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_foods")
public class FoodModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String calories;
    private String proteins;
    private String water;
    private String minerals;
    private String vitamins;
    private String fats;

    public int getId() {
        return id;
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

    public FoodModel(int id, String name, String description, String calories, String proteins, String water, String minerals, String vitamins, String fats) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.proteins = proteins;
        this.water = water;
        this.minerals = minerals;
        this.vitamins = vitamins;
        this.fats = fats;
    }

    public FoodModel() {

    }
}
