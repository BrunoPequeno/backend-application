package com.unlockway.backendapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class UserModel {
    private UUID id;
    private String firstName;
    private String lastName;
    @Column(name = "user_password")
    private String password;
    private String email;
    private double height;
    private double weight;
    private Goal goals;
    public enum Goal{
        GainMuscleMass,// Ganhar massa muscular
        LoseWeight,// Perder peso
        keepHealthy,// Se manter saudável
    }

    public UUID getId() {
        return id;
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

    public Goal getGoals() {
        return goals;
    }

    public void setGoals(Goal goals) {
        this.goals = goals;
    }

    public UserModel(UUID id, String firstName, String lastName, String password, String email, double height, double weight, Goal goals) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
    }

    public UserModel() {

    }
}
