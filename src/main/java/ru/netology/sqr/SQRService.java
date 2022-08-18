package ru.netology.sqr;

public class SQRService {
    public int SQRInRange(int minRange, int maxRange) {
        int report = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minRange && i * i <= maxRange) {
                report++;
            }

        }
        return report;

    }


}
