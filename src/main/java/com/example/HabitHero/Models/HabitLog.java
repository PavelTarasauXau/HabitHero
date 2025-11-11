package com.example.HabitHero.Models;

import java.time.LocalDate;

public class HabitLog {

    private final LocalDate date;
    private int completedCount;

    public HabitLog(LocalDate date, int completedCount) {
        this.date = date;
        this.completedCount = completedCount;
    }

    public void increment(){
        completedCount++;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getCompletedCount() {
        return completedCount;
    }

    public void setCompletedCount(int completedCount) {
        this.completedCount = completedCount;
    }
}
