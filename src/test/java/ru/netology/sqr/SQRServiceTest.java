package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void someSquaresInRange() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.sortSquare(200, 300);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void noSquaresInRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.sortSquare(200, 210);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void allSquaresInRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.sortSquare(100, 9801);
        assertEquals(expected, actual);
    }
}