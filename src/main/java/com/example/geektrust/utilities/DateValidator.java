package com.example.geektrust.utilities;

import java.text.SimpleDateFormat;

public class DateValidator {
    private static final String VALID_DATE_FORMAT = "dd-MM-yyyy";

    public static boolean isValidDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(VALID_DATE_FORMAT);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateString);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
