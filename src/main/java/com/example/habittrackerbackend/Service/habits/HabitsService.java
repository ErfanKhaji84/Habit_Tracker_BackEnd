package com.example.habittrackerbackend.Service.habits;


import com.example.habittrackerbackend.Dao.habits.HabitsRepository;
import com.example.habittrackerbackend.Model.habits.Habits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitsService {
  @Autowired
  HabitsRepository habitsRepository;


  public Habits addHabits(Habits habits) {
    return habitsRepository.save(habits);
  }
}
