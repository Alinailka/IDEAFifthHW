package ru.netology.sqr;


public class SQRService {
    public int sortSquare(
            int minBorder,
            int maxBorder
    ) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder) {
                if (i * i <= maxBorder) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

