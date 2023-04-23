package com.example.geektrust.entities;

import com.example.geektrust.constants.Response;
import com.example.geektrust.constants.TopupCategory;
import com.example.geektrust.interfaces.SubscribeStreamingPlan;
import com.example.geektrust.interfaces.SubscribeTopup;

import java.util.ArrayList;
import java.util.List;

public class User implements SubscribeStreamingPlan, SubscribeTopup {
    private final List<StreamingPlan> streamingPlanList = new ArrayList<>();
    private Topup topup;
    private boolean isTopupAdded = false;

    @Override
    public void addToStreamingPlans(String startDate, String inputPlanCategory, String inputPlanType) {
        StreamingPlan sp = new StreamingPlan(startDate, inputPlanCategory, inputPlanType);
        if (isPlanAlreadyAdded(sp)) {
            System.out.println(Response.ADD_SUBSCRIPTION_FAILED + " " + Response.DUPLICATE_CATEGORY);
            return;
        }
        streamingPlanList.add(sp);
    }

    public List<StreamingPlan> getStreamingPlanList() {
        return streamingPlanList;
    }

    public boolean isPlanAlreadyAdded(StreamingPlan streamingPlan) {
        return streamingPlanList.stream().anyMatch(sp -> sp.getPlanCategory().equals(streamingPlan.getPlanCategory()));
    }

    public Topup getTopup() {
        return topup;
    }

    @Override
    public void addTopup(String startDate, String inputCategory,String duration) {
        if (streamingPlanList.isEmpty()) {
            System.out.println(Response.ADD_TOPUP_FAILED + " " + Response.SUBSCRIPTIONS_NOT_FOUND);
            return;
        }
        if (isTopupAdded){
            System.out.println(Response.ADD_TOPUP_FAILED + " " + Response.DUPLICATE_TOPUP);
            return;
        }
        this.topup = new Topup(TopupCategory.getCategory(inputCategory), Integer.parseInt(duration));
        isTopupAdded = true;
    }

    public boolean isTopupAlreadyAdded() {
        return isTopupAdded;
    }


}
