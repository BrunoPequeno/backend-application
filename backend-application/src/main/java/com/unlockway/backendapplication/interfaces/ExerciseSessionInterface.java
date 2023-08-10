package com.unlockway.backendapplication.interfaces;

import java.time.LocalDate;
import java.util.UUID;

public interface ExerciseSessionInterface {
    UUID getExerciseID();
    int getRepetitions();
    double getRestTimeBetweenRepetitions();// IA
    String getImprovements();// IA
    boolean getisEnable();
    LocalDate getcreatedAt();
    LocalDate getupdatedAt();
}
