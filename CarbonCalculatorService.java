package com.example.carbontracker.service;

import com.example.carbontracker.model.Activity;
import org.springframework.stereotype.Service;

@Service
public class CarbonCalculatorService {

    // In real app, load factors from DB
    private static final double TRAVEL_FACTOR = 0.21; // kg CO₂ per km
    private static final double FOOD_FACTOR = 2.5;    // kg CO₂ per kg meat
    private static final double ENERGY_FACTOR = 0.4;  // kg CO₂ per kWh

    public double calculateEmission(Activity activity) {
        switch (activity.getType()) {
            case TRAVEL:
                return activity.getValue() * TRAVEL_FACTOR;
            case FOOD:
                return activity.getValue() * FOOD_FACTOR;
            case ENERGY:
                return activity.getValue() * ENERGY_FACTOR;
            default:
                return 0.0;
        }
    }
}
