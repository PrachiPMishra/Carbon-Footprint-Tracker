package com.example.carbontracker.controller;

import com.example.carbontracker.model.Activity;
import com.example.carbontracker.repository.ActivityRepository;
import com.example.carbontracker.service.CarbonCalculatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    private final ActivityRepository repository;
    private final CarbonCalculatorService calculator;

    public ActivityController(ActivityRepository repository,
                              CarbonCalculatorService calculator) {
        this.repository = repository;
        this.calculator = calculator;
    }

    @GetMapping("/{userId}")
    public List<Activity> getActivities(@PathVariable Long userId) {
        return repository.findByUserId(userId);
    }

    @PostMapping
    public double addActivity(@RequestBody Activity activity) {
        repository.save(activity);
        return calculator.calculateEmission(activity);
    }
}
