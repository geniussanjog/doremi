package com.example.geektrust.constants;

public enum PlanCategory {
    MUSIC, VIDEO, PODCAST ;

    public static PlanCategory getCategory(String input) {
        switch (input) {
            case "MUSIC":
                return PlanCategory.MUSIC;
            case "VIDEO":
                return PlanCategory.VIDEO;
            case "PODCAST":
                return PlanCategory.PODCAST;
            default:
                return null;
        }
    }
}
