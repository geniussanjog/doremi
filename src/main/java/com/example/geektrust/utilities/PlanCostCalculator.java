package com.example.geektrust.utilities;

import com.example.geektrust.constants.PlanCategory;
import com.example.geektrust.constants.PlanCharges;
import com.example.geektrust.constants.PlanType;

public class PlanCostCalculator {
    public static int calculatePlanCost(PlanCategory planCategory, PlanType planType) {
        int cost = 0;
        switch (planType) {
            case FREE:           cost = 0;break;
            case PERSONAL:
                switch (planCategory) {
                    case MUSIC:  cost = PlanCharges.COST_OF_MUSIC_PERSONAL_PLAN;break;
                    case VIDEO:  cost = PlanCharges.COST_OF_VIDEO_PERSONAL_PLAN;break;
                    case PODCAST:cost = PlanCharges.COST_OF_PODCAST_PERSONAL_PLAN;break;
                }
                break;
            case PREMIUM:
                switch (planCategory) {
                    case MUSIC:  cost = PlanCharges.COST_OF_MUSIC_PREMIUM_PLAN;break;
                    case VIDEO:  cost = PlanCharges.COST_OF_VIDEO_PREMIUM_PLAN;break;
                    case PODCAST:cost = PlanCharges.COST_OF_PODCAST_PREMIUM_PLAN;break;
                }
                break;
        }
        return cost;
    }
}
