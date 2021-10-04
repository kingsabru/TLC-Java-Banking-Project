package com.company;

public class FundTrade extends TradeAbstract{
    private final double dividend;

    FundTrade (String ID, String Symbol, int quantity, double price, double percentage){
        super(ID, Symbol, quantity, price);

        if(percentage >= 0 || percentage <= 100)
            dividend = percentage * this.getPrice();
        else dividend = 0;
    }

    public double getDividend() {
        return dividend;
    }

    @Override
    public void calcDividend(double percentage){}
}
