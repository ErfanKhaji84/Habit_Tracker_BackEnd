package com.example.habittrackerbackend.Model.habits;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "habits")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Habits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)  // اجباری بودن فیلد
    private String name;

    @Column(name = "small_bite")
    private String smallBite;

    @Column(name = "special_bite")
    private String specialBite;

    @Column(name = "emergency_bite")
    private String emergencyBite;
}
