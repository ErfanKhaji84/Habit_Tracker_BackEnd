package com.example.habittrackerbackend.Dao.habits;

import com.example.habittrackerbackend.Model.habits.Habits;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;


@Registered
public interface HabitsRepository extends JpaRepository<Habits, Long> {

}
