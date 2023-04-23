package com.example.geektrust.utilities;

import com.example.geektrust.constants.TopupCategory;
import com.example.geektrust.constants.TopupCharges;

public class TopupCostCalculator {
    public static int calculateTopupCost(TopupCategory topupCategory, int topupDuration) {
        int cost = 0;
        switch (topupCategory) {
            case FOUR_DEVICE:   cost = TopupCharges.COST_OF_FOUR_DEVICE_TOPUP*topupDuration; break;
            case TEN_DEVICE:    cost = TopupCharges.COST_OF_TEN_DEVICE_TOPUP*topupDuration; break;
        }
        return cost;
    }
}
