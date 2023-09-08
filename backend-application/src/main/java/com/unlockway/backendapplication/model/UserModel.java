package com.unlockway.backendapplication.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_users")
public class UserModel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "password_user")
    private String password;
    private String email;
    private String height;
    private String weight;
    private String goal;
//    public enum Goal{
//        GAINMASS, LOSEWEIGHT, KEEPHEALTH, // Ganhar massa muscular // Perder peso // Se manter saudável
//    }

    public int getId() {
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getGoals() {
        return goal;
    }

    public void setGoals(String goal) {
        this.goal = goal;
    }

    public UserModel(int id, String firstName, String lastName, String password, String email, String height, String weight, String goals) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
    }

    public UserModel() {

    }
}
