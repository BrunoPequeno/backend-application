package com.unlockway.backendapplication.model;

import com.unlockway.backendapplication.interfaces.TimeInterface;
import com.unlockway.backendapplication.interfaces.MealInterface;
import java.time.LocalDate;
import java.util.UUID;

public class RoutimeModel {
    private UUID id;
    private RoutineMeal[] meals;
    private RoutineExercise[] circuits;
    private LocalDate startDate;
    private LocalDate endDate;
    private WeekRepetitions weekRepetitions;
    private boolean isEnable;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private class WeekRepetitions {
        public boolean sunday;
        public boolean monday;
        public boolean tuesday;
        public boolean wednesday;
        public boolean thursday;
        public boolean friday;
        public boolean saturday;

    }

    public abstract class RoutineMeal implements TimeInterface, MealInterface{

    }

    public abstract class RoutineExercise implements TimeInterface {

    }

    public UUID getId() {
        return id;
    }

    public RoutineMeal[] getMeals() {
        return meals;
    }

    public void setMeals(RoutineMeal[] meals) {
        this.meals = meals;
    }

    public RoutineExercise[] getCircuits() {
        return circuits;
    }

    public void setCircuits(RoutineExercise[] circuits) {
        this.circuits = circuits;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public WeekRepetitions getWeekRepetitions() {
        return weekRepetitions;
    }

    public void setWeekRepetitions(WeekRepetitions weekRepetitions) {
        this.weekRepetitions = weekRepetitions;
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

    public RoutimeModel(UUID id, RoutineMeal[] meals, RoutineExercise[] circuits, LocalDate startDate, LocalDate endDate, WeekRepetitions weekRepetitions, boolean isEnable, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.meals = meals;
        this.circuits = circuits;
        this.startDate = startDate;
        this.endDate = endDate;
        this.weekRepetitions = weekRepetitions;
        this.isEnable = isEnable;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public RoutimeModel() {

    }
}
