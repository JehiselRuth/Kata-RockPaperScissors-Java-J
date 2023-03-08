package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScissorsTest {
    @Test
    public void test_are_scissors() {
        Scissors scissors = new Scissors();
        assertTrue(scissors instanceof Scissors);
        assertEquals("Scissors", scissors.getType());
    }
}
