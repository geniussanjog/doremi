package com.example.geektrust.utilities;

import com.example.geektrust.constants.PlanCategory;
import com.example.geektrust.constants.PlanType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanCostCalculatorTest {

    @Test
    void calculatePlanCost() {
        int cost;

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.MUSIC, PlanType.FREE);
        assertEquals(0,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.MUSIC,PlanType.PERSONAL);
        assertEquals(100,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.MUSIC,PlanType.PREMIUM);
        assertEquals(250,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.VIDEO,PlanType.FREE);
        assertEquals(0,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.VIDEO,PlanType.PERSONAL);
        assertEquals(200,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.VIDEO,PlanType.PREMIUM);
        assertEquals(500,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.PODCAST,PlanType.FREE);
        assertEquals(0,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.PODCAST,PlanType.PERSONAL);
        assertEquals(100,cost);

        cost = PlanCostCalculator.calculatePlanCost(PlanCategory.PODCAST,PlanType.PREMIUM);
        assertEquals(300,cost);

    }

}