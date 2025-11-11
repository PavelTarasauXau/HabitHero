package com.example.HabitHero.Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Habit {

    private UUID habitID;
    private String name;
    private String description;
    private LocalDate startDate;
    private int timesPerDay;
    private boolean archived;
    private final List<HabitLog> logs = new ArrayList<>();

    public Habit(String name, String description, LocalDate startDate, int timesPerDay, boolean archived) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.timesPerDay = timesPerDay;
        this.archived = archived;
    }

    public void addLog(HabitLog log){
        logs.add(log);
    }

    public List<HabitLog> getLogs() {
        return logs;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getTimePerDay() {
        return timesPerDay;
    }

    public void setTimePerDay(int timePerDay) {
        this.timesPerDay = timePerDay;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

}
