package com.example.carbontracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; 

    @Enumerated(EnumType.STRING)
    private ActivityType type;

    private double value;  
    private String unit;   
    private LocalDate date;

}
