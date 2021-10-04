package com.company;

public class BondTrade extends TradeAbstract{
    private final double dividend;

    BondTrade (String ID, String Symbol, int quantity, double price, double dividend){
        super(ID, Symbol, quantity, price);
        if(dividend >= 0)
            this.dividend = dividend;
        else this.dividend = 0;
    }

    public double getDividend() {
        return dividend;
    }

    @Override
    public void calcDividend(double dividend){
    }
}
