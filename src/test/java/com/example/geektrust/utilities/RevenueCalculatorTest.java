package com.example.geektrust.utilities;

import com.example.geektrust.entities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RevenueCalculatorTest {
    @Test
    void calculateRevenue() {
        String startDate = "20-02-2022";
        User user = new User();
        user.addToStreamingPlans(startDate, "MUSIC", "PERSONAL");
        user.addToStreamingPlans(startDate, "VIDEO", "PREMIUM");
        user.addToStreamingPlans(startDate, "PODCAST", "FREE");
        user.addTopup(startDate,"FOUR_DEVICE","3");
        int revenue = RevenueCalculator.calculateRevenue(user);
        assertEquals(750,revenue);
    }

}