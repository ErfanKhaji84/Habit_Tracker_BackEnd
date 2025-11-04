package com.example.habittrackerbackend.Web.Controller;

import com.example.habittrackerbackend.Model.habits.Habits;
import com.example.habittrackerbackend.Service.habits.HabitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/habits")
@CrossOrigin(origins = "http://localhost:4200")

public class HabitsController {

  @Autowired
  HabitsService habitsService;

  @PostMapping("/save")
  public Habits addHabits(@RequestBody Habits habits) {
    return habitsService.addHabits(habits);
  }


}
