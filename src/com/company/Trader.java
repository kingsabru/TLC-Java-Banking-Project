package com.company;

public class Trader {
    private String name;
    private Account account;

    Trader(String name, Account account){
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addTrade(Trade trade){
        double newValue = this.account.getTotalValue() + (trade.getPrice() * trade.getQuantity());
        this.account.setTotalValue(newValue);
    }




}
