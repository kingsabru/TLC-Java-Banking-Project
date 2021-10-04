package com.company;

import java.time.LocalDate;

public class TradeAbstract {
  private String ID;
  private String Symbol;
  private int quantity;
  private double price;
  private LocalDate time;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getSymbol() {
    return Symbol;
  }

  public void setSymbol(String symbol) {
    Symbol = symbol;
  }

  public LocalDate getTime() {
    return time;
  }

  public void setTime(LocalDate time) {
    this.time = time;
  }

  TradeAbstract(){ }

  TradeAbstract(String ID, String Symbol, int quantity, double price){
    this(ID, Symbol, quantity);
    this.price = price;
    this.time = LocalDate.now();
  }

  TradeAbstract(String ID, String Symbol, int quantity){
    this.ID = ID;
    this.Symbol = Symbol;
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price){
    if(price >= 0) this.price = price;
    else this.price = 0;
  }

  public String toString(){
    return String.format("");
  }

  public void calcDividend(double dividend){};
}
