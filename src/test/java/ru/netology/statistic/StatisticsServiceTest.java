package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StatisticsServiceTest {


    @Test
    void CalculateTotalSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.totalSales(sales);

        assertEquals(expected, actual);

    }
    @Test
    void CalculateAverageSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmountOfSalesPerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void MonthWithMaximumSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void  MonthWithAMinimumSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void BelowAverageSales() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.underAverageSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void ExceedingTheAverageSale() {
        StatisticsService service = new StatisticsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.overAverageSales(sales);

        assertEquals(expected, actual);
    }

}
