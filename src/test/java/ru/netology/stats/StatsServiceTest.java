package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void SumAllSalesTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverageSumTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.averageSum(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void maxSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSalesInMonth = 8;
        int actualMaxSalesInMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSalesInMonth, actualMaxSalesInMonth);
    }

    @Test
    public void minSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSalesInMonth = 9;
        int actualMinSalesInMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinSalesInMonth, actualMinSalesInMonth);
    }

    @Test
    public void belowAverageTest() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedProfit = 5;
        int actualMonths = service.belowAverage(sales);

        Assertions.assertEquals(expectedProfit, actualMonths);
    }

    @Test
    public void aboveAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedUnprofit = 5;
        int actualUnprofit = service.aboveAverage(sales);

        Assertions.assertEquals(expectedUnprofit, actualUnprofit);

    }

}
