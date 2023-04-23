package com.example.geektrust.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    @Test
    void isPlanAlreadyAdded() {
        String startDate = "20-02-2022";
        boolean planAlreadyAdded ;
        User user = new User();

        StreamingPlan sp = new StreamingPlan(startDate, "MUSIC", "PERSONAL");

        planAlreadyAdded = user.isPlanAlreadyAdded(sp);
        assertFalse(planAlreadyAdded);

        //add plan now to the list of streaming plans of the provided user
        user.addToStreamingPlans(startDate, "MUSIC", "PERSONAL");

        planAlreadyAdded = user.isPlanAlreadyAdded(sp);
        assertTrue(planAlreadyAdded);

        StreamingPlan sp2 = new StreamingPlan(startDate, "VIDEO", "PERSONAL");

        planAlreadyAdded = user.isPlanAlreadyAdded(sp2);
        assertFalse(planAlreadyAdded);

        //add plan now to the list of streaming plans of the provided user
        user.addToStreamingPlans(startDate, "VIDEO", "PERSONAL");

        planAlreadyAdded = user.isPlanAlreadyAdded(sp);
        assertTrue(planAlreadyAdded);
    }

    @Test
    void isTopupAlreadyAdded() {
        String startDate = "10-01-2022";
        User user = new User();
        user.addToStreamingPlans(startDate, "MUSIC", "PERSONAL");
        user.addToStreamingPlans(startDate, "VIDEO", "PREMIUM");
        user.addToStreamingPlans(startDate, "PODCAST", "FREE");

        assertFalse(user.isTopupAlreadyAdded());
        //Add topup to user
        user.addTopup(startDate,"FOUR_DEVICE","3");

        assertTrue(user.isTopupAlreadyAdded());
    }
}