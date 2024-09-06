package com.cinema;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeatTest {

    @Test
    void testSeatCreation() {
        Seat seat = new Seat(1, 2);
        assertEquals(1, seat.getRow());
        assertEquals(2, seat.getSeatNumber());
        assertTrue(seat.isAvailable());
    }

    @Test
    void testTakeSeat() {
        Seat seat = new Seat(1, 2);
        seat.takeSeat();
        assertFalse(seat.isAvailable());
    }

    @Test
    void testReleaseSeat() {
        Seat seat = new Seat(1, 2);
        seat.takeSeat();
        seat.releaseSeat();
        assertTrue(seat.isAvailable());
    }
}