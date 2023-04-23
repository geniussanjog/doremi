package com.example.geektrust.utilities;

import com.example.geektrust.entities.StreamingPlan;
import com.example.geektrust.entities.Topup;
import com.example.geektrust.entities.User;
import com.example.geektrust.constants.Response;

import java.util.List;

public class RevenueCalculator {
    public static int calculateRevenue(User user) {
        int revenue = 0;
        List<StreamingPlan> streamingPlansList = user.getStreamingPlanList();
        for (StreamingPlan s : streamingPlansList) {
            System.out.println(Response.RENEWAL_REMINDER + " " + s.getPlanCategory() + " " + s.getRenewalDate());
            revenue += s.getCost();
        }
        if (user.isTopupAlreadyAdded()) {
            Topup t = user.getTopup();
            revenue += t.getTopupCost();
        }
        return revenue;
    }
}
