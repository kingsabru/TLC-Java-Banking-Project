package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Kingsley", "Yeboah");
        client.addTrade(new FundTrade("T1", "APPL", 100, 15.25, 10));
    }

    @Test
    void getMembershipType() {
//        assertEquals(true, client.getMembershipType().equals(new Bronze()));
        assertEquals(true, client.getMembershipType() instanceof Bronze);
    }

    @Test
    void getPoints() {
        assertEquals(1, client.getPoints());
    }
}