package org.example.Task;

import org.example.Task.TestVagrant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestVagrantTest {
    TestVagrant testVagrant;
    @BeforeEach
    void setUp() {
        testVagrant = new TestVagrant();
    }

    @Test
    @DisplayName("Number of Foreign Players")
    void testGetNumberOfForeignPlayersInTeam() {
        assertTrue(testVagrant.getNumberOfForeignPlayersInTeam() <= 4,
                "team should have only 4 foreign players");
    }

    @Test
    @DisplayName("Number of Wicket Keepers in team")
    void testGetWicketKeeperCount() {
        assertTrue(testVagrant.getWicketKeeperCount() >= 1,
                "team should have atleast 1 wicket keeper");
    }
}