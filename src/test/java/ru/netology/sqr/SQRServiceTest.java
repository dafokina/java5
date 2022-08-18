package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "9,500,1000", //тест в обычных границах
            "8,100,300",  // тест нижней границы диапазона
            "5,9000,9801" // тест верхней гранцы диапазона
    })
    public void testOfRange(int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();


        int actual = service.SQRInRange(minRange, maxRange);
        Assertions.assertEquals(expected, actual);


    }

}