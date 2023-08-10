package com.unlockway.backendapplication.interfaces;

import com.unlockway.backendapplication.model.FoodModel;

import java.time.LocalDate;
import java.util.UUID;

public class Meal implements MealInterface {
    private UUID id;
    private String name;
    private String imageUrl;
    private String description;
    private Category category;
    private String preparationMethod;
    private FoodModel[] ingredints;
    private boolean isEnable;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getPreparationMethod() {
        return preparationMethod;
    }

    public void setPreparationMethod(String preparationMethod) {
        this.preparationMethod = preparationMethod;
    }

    public FoodModel[] getIngredints() {
        return ingredints;
    }

    public void setIngredints(FoodModel[] ingredints) {
        this.ingredints = ingredints;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
