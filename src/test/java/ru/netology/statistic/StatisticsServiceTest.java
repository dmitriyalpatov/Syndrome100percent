package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatisticsServiceTest {

    @Test
    void findMaximum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void maximumInTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {36, 5, 8, 4, 5, 3,55, 8, 56, 11, 11, 26};
        long expected = 56;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }



    @Test
    void maximumAmountInTheMiddlee() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20,180, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.findMax(sales);

        assertEquals(expected, actual);

    }



    }



