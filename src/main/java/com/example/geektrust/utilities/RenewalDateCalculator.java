package com.example.geektrust.utilities;

import com.example.geektrust.constants.PlanType;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RenewalDateCalculator {
    private static final int NO_OF_DAYS_BEFORE_REMINDER = 10;
    private static final String VALID_DATE_FORMAT = "dd-MM-yyyy";
    public static String calculateRenewalDate(String startDate, PlanType planType) {
        SimpleDateFormat formatter = new SimpleDateFormat(VALID_DATE_FORMAT);
        try {
            // Convert string to date
            Date date = formatter.parse(startDate);
            // Add one month to the date
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, planType.getPlanDuration());
            // Subtract n days from the date
            cal.add(Calendar.DAY_OF_MONTH, -NO_OF_DAYS_BEFORE_REMINDER);
            Date newDate = cal.getTime();
            // Format the new date as a string
            return formatter.format(newDate);
        } catch (Exception e) {
            return null;
        }
    }
}
