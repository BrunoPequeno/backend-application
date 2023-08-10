package com.unlockway.backendapplication.model;

import java.util.UUID;

public class ExerciseModel {
    private UUID id;
    private String name;
    private String description;
    private String benefits;
    private String imageURL;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public ExerciseModel(UUID id, String name, String description, String benefits, String imageURL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.benefits = benefits;
        this.imageURL = imageURL;
    }

    public ExerciseModel() {

    }
}
