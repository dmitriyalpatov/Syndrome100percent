package ru.netology.statistic;

public class StatisticsService {

    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }

    public int totalSales(int[] sales) {
        return 0;
    }

    public int averageAmountOfSalesPerMonth(int[] sales) {
        return 0;
    }

    public int maxSales(int[] sales) {
        return 0;
    }

    public int minSales(int[] sales) {
        return 0;
    }

    public int underAverageSales(int[] sales) {
        return 0;
    }

    public int overAverageSales(int[] sales){
        return  0;
    }
}
