package com.example.geektrust.entities;

import com.example.geektrust.constants.PlanCategory;
import com.example.geektrust.constants.PlanType;
import com.example.geektrust.utilities.PlanCostCalculator;
import com.example.geektrust.utilities.RenewalDateCalculator;

public class StreamingPlan {
    private PlanCategory planCategory;
    private PlanType planType;
    private String startDate;
    private String renewalDate;
    private int cost;

    public StreamingPlan(String startDate, String inputPlanCategory, String inputPlanType) {
        this.startDate = startDate;
        this.planCategory = PlanCategory.getCategory(inputPlanCategory);
        this.planType = PlanType.getPlan(inputPlanType);
        calculateAndSetRenewalDate();
        calculateAndSetCost();
    }
    public String getRenewalDate() {
        return renewalDate;
    }
    public void calculateAndSetRenewalDate() {
        this.renewalDate = RenewalDateCalculator.calculateRenewalDate(startDate,planType);
    }
    public PlanCategory getPlanCategory() {
        return planCategory;
    }
    public void calculateAndSetCost(){
        this.cost = PlanCostCalculator.calculatePlanCost(planCategory, planType);
    }
    public int getCost(){
        return cost;
    }


}
