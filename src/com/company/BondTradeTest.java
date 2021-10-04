package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {
    BondTrade bondTrade;

    @BeforeEach
    void setUp() {
        bondTrade = new BondTrade("T1", "APPL", 100, 15.25, 10);
    }

    @Test
    void getDividend() {
        assertEquals(10,bondTrade.getDividend());
    }
}