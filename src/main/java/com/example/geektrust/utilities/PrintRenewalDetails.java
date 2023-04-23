package com.example.geektrust.utilities;

import com.example.geektrust.constants.Response;
import com.example.geektrust.entities.User;

public class PrintRenewalDetails {
    public static void print(User user) {
        if (user.getStreamingPlanList().isEmpty()) {
            System.out.println(Response.SUBSCRIPTIONS_NOT_FOUND);
            return;
        }
        int revenue = RevenueCalculator.calculateRevenue(user);
        System.out.println(Response.RENEWAL_AMOUNT + " " + revenue);
    }
}
