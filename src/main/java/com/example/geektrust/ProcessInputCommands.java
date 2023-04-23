package com.example.geektrust;

import com.example.geektrust.constants.Response;
import com.example.geektrust.entities.User;
import com.example.geektrust.utilities.DateValidator;
import com.example.geektrust.utilities.PrintRenewalDetails;

public class ProcessInputCommands {
    public static String handleStartSubscription(String date) {
        if (!DateValidator.isValidDate(date)) {
            System.out.println(Response.INVALID_DATE);
            return null;
        } else {
            return date;
        }
    }

    public static void handleAddSubscription(String startDate, String plan, String amount, User user) {
        if (startDate == null) {
            System.out.println(Response.ADD_SUBSCRIPTION_FAILED + " " + Response.INVALID_DATE);
        } else {
            user.addToStreamingPlans(startDate, plan, amount);
        }
    }

    public static void handleAddTopup(String startDate, String plan, String amount, User user) {
        if (startDate == null) {
            System.out.println(Response.ADD_TOPUP_FAILED + " " + Response.INVALID_DATE);
        } else {
            user.addTopup(startDate, plan, amount);
        }
    }

    public static void handlePrintRenewalDetails(User user) {
        PrintRenewalDetails.print(user);
    }
}
