package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookService service = new BookService();

    // Fine Tests
    @Test
    void testFineZeroDays() {
        assertEquals(0, service.calculateFine(0));
    }

    @Test
    void testFinePositiveDays() {
        assertEquals(25, service.calculateFine(5));
    }

    @Test
    void testFineNegativeDays() {
        assertEquals(0, service.calculateFine(-3));
    }

    // Availability Tests
    @Test
    void testAvailableStock() {
        assertTrue(service.checkAvailability(10));
    }

    @Test
    void testNotAvailableStock() {
        assertFalse(service.checkAvailability(0));
    }
}
