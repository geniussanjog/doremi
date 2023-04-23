package com.example.geektrust.constants;

public enum TopupCategory {
    FOUR_DEVICE, TEN_DEVICE;

    public static TopupCategory getCategory(String input) {
        switch (input) {
            case "FOUR_DEVICE": return FOUR_DEVICE;
            case "TEN_DEVICE":  return TEN_DEVICE;
            default:return null;
        }
    }
}
