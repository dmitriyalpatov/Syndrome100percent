package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatisticsServiceTest {


    @Test
    void CalculateTotalSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {180, 15,179, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.findMax(sales);

        assertEquals(expected, actual);

    }
    @Test
    void CalculateAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 15, 18};
        long expected = 20;

        long actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void MonthWithMaximumSale() {
        StatisticsService service = new StatisticsService();
        long[] sales = {8, 22, 13, 15, 17, 20, 19, 20, 7, 14, 14, 21};
        long expected = 22;

        long actual = service.findMax(sales);

        assertEquals(expected, actual);
    }



}
