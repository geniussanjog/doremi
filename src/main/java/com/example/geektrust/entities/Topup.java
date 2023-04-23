package com.example.geektrust.entities;

import com.example.geektrust.constants.TopupCategory;
import com.example.geektrust.utilities.TopupCostCalculator;

public class Topup {
    private TopupCategory topupCategory;
    private int topupDuration;

    public Topup(TopupCategory topupCategory,int topupDuration) {
        this.topupCategory = topupCategory;
        this.topupDuration = topupDuration;
    }
    public int getTopupCost() {
        return TopupCostCalculator.calculateTopupCost(this.topupCategory,this.topupDuration);
    }

}
