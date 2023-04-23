package com.example.geektrust.utilities;

import com.example.geektrust.constants.PlanType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RenewalDateCalculatorTest {


    @Test
    void calculateRenewalDate1() {
        String renewalDate = RenewalDateCalculator.calculateRenewalDate("20-07-2022", PlanType.PREMIUM);
        assertEquals("10-10-2022",renewalDate);
    }

    @Test
    void calculateRenewalDate2() {
        String renewalDate = RenewalDateCalculator.calculateRenewalDate("20-08-2022", PlanType.FREE);
        assertEquals("10-09-2022",renewalDate);
    }


}