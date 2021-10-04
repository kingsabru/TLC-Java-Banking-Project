package com.company;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;

    private List<TradeAbstract> trade;
    private MembershipType membershipType;
    private int points;

    Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        trade = new ArrayList<>();
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;

        if (this.points < 10) setMembershipType(new Bronze());
        else if (this.points >= 10 && this.points < 20) setMembershipType(new Silver());
        else setMembershipType(new Gold());
    }

    public void addTrade(TradeAbstract trade){
        this.trade.add(trade);
        setPoints(getPoints() + 1);
    }

    public boolean canTrade(){return true; /*fill-in code (update later)*/}
}
