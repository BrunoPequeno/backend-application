package com.unlockway.backendapplication.interfaces;

import java.time.LocalDate;
import java.util.UUID;

public class ExerciseSession implements ExerciseSessionInterface{
    public UUID id;
    public int repetitions;
    public double restTimeBetweenRepetitions;// IA
    public String improvements;// IA
    public boolean isEnable;
    public LocalDate createdAt;
    public LocalDate updatedAt;

}
