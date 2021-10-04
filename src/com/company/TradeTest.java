package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    Trade trade;

    @BeforeEach
    void setUp() {
        trade = new Trade("T1", "APPL", 100, 15.25);
    }

    @Test
    void addPrice() {
        trade.setPrice(-4);
        Assertions.assertEquals(true, trade.getPrice() >= 0);
    }
}