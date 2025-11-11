package com.example.HabitHero.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class HabitRepository {

    private final HashMap<UUID, Habit> habits = new HashMap<>();

    public void save(UUID id, Habit habit) {
        habits.put(id, habit);
    }

    public Habit findById(UUID id) {
        return habits.get(id);
    }

    public List<Habit> findByUserId(UUID userId) {
        List<Habit> result = new ArrayList<>();
        for (Habit habit : habits.values()) {
            if (habit.getUserID().equals(userId)) {
                result.add(habit);
            }
        }
        return result;
    }

    public void delete(UUID id) {
        habits.remove(id);
    }
}
