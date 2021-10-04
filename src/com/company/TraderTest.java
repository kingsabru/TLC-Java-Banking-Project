package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {
    Trader trader;

    @BeforeEach
    void setUp() {
        trader = new Trader("Mark", new Account());
    }

    @Test
    void addTrade() {
        trader.addTrade(new Trade("T1", "APPL", 100, 15.25));
        Assertions.assertEquals(1525, trader.getAccount().getTotalValue());
    }
}