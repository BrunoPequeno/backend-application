package com.unlockway.backendapplication.model;

import java.util.UUID;

public class FoodModel {
    private UUID id;
    private String name;
    private String description;
    private double calories;
    private double proteins;
    private double water;
    private double minerals;
    private double vitamins;
    private double fats;

    public UUID getId() {
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

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProteins() {
        return proteins;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getMinerals() {
        return minerals;
    }

    public void setMinerals(double minerals) {
        this.minerals = minerals;
    }

    public double getVitamins() {
        return vitamins;
    }

    public void setVitamins(double vitamins) {
        this.vitamins = vitamins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public FoodModel(UUID id, String name, String description, double calories, double proteins, double water, double minerals, double vitamins, double fats) {
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
