package com.unlockway.backendapplication.api.dto;

import com.unlockway.backendapplication.model.UserModel;
import jakarta.persistence.Column;
import org.springframework.beans.BeanUtils;

import java.util.UUID;

public class UserDTO {
    private UUID id;

    private String firstName;
    private String lastName;

    private String password;
    private String email;
    private double height;
    private double weight;
    private UserModel.Goal goals;

    public UserDTO(UserModel entity){
        BeanUtils.copyProperties(entity, this);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public UserModel.Goal getGoals() {
        return goals;
    }

    public void setGoals(UserModel.Goal goals) {
        this.goals = goals;
    }
}
