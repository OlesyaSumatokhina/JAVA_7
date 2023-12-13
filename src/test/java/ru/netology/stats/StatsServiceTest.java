package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void SummaAllDay() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.summaMoney(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverAmountAllDay() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAver = 15;
        int actualAver = service.averAmount(sales);
        Assertions.assertEquals(expectedAver, actualAver);

    }

    @Test
    public void MaxSaleInMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSale = 8;
        int actualMaxSale = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSale, actualMaxSale);

    }

    @Test
    public void MinSaleInMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSale = 9;
        int actualMinSale = service.minSales(sales);
        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void SummMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelAver = 5;
        int actualBelAver = service.beloweAverage(sales);
        Assertions.assertEquals(expectedBelAver, actualBelAver);
    }

    @Test
    public void SummMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAver = 5;
        int actualAboveAver = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAver, actualAboveAver);
    }
}
