package com.example.geektrust.constants;

public enum PlanType {
    FREE(1), PERSONAL(1), PREMIUM(3) ;
    private final int planDuration;
    PlanType(int planDuration) {
        this.planDuration = planDuration;
    }
    public int getPlanDuration() {
        return planDuration;
    }
    public static PlanType getPlan(String input) {
        switch(input) {
            case "FREE"     : return PlanType.FREE ;
            case "PREMIUM"  : return PlanType.PREMIUM;
            case "PERSONAL" : return PlanType.PERSONAL;
            default:return null;
        }
    }
}
