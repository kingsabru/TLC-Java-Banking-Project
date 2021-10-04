package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {
    FundTrade fundTrade;

    @BeforeEach
    void setUp() {
        fundTrade = new FundTrade("T1", "APPL", 100, 15.25, 10);
    }

    @Test
    void getDividend(){
        Assertions.assertEquals(152.5, fundTrade.getDividend());
    }

}