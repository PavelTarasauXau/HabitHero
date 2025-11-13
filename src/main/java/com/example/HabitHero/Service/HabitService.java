package com.example.HabitHero.Service;
import com.example.HabitHero.Models.HabitRepository;
import com.example.HabitHero.Models.Habit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HabitService {

    HabitRepository repository = new HabitRepository();

    public Habit createHabit(UUID userID, String name, String description,
                             LocalDate startDate, int timesPerDay) {

        UUID habitID = UUID.randomUUID();
        Habit habit = new Habit(
                habitID,
                userID,
                name,
                description,
                startDate,
                timesPerDay,
                false
        );
        repository.save(habitID, habit);
        return habit;
    }

    public List<Habit> getHabitsByUser(UUID userID){
        return repository.findByUserId(userID);
    }

    public void deleteHabit(UUID userID, UUID habitID) {
        Habit habit = repository.findById(habitID);
        if (habit == null) {
            throw new IllegalArgumentException("Habit not found");
        }

        if (!habit.getUserID().equals(userID)) {
            throw new IllegalArgumentException("This habit does not belong to the user");
        }
        repository.delete(habitID);
    }

    public void logCompletion(UUID userID, UUID habitID, LocalDate date, int inc){

    }


}
