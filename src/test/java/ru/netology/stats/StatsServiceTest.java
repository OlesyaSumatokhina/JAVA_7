package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void SummaAllDay() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.summaMoney(array);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void AverAmountAllDay() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAver = 15;
        int actualAver = service.averAmount(array);
        Assertions.assertEquals(expectedAver, actualAver);

    }

    @Test
    public void MaxSaleInMonth() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSale = 8;
        int actualMaxSale = service.maxSales(array);
        Assertions.assertEquals(expectedMaxSale, actualMaxSale);

    }

    @Test
    public void MinSaleInMonth() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSale = 9;
        int actualMinSale = service.minSales(array);
        Assertions.assertEquals(expectedMinSale, actualMinSale);
    }

    @Test
    public void SummMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelAver = 5;
        int actualBelAver = service.beloweAverage(array);
        Assertions.assertEquals(expectedBelAver, actualBelAver);
    }

    @Test
    public void SummMonthAboveAverage() {
        StatsService service = new StatsService();
        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAver = 5;
        int actualAboveAver = service.aboveAverage(array);
        Assertions.assertEquals(expectedAboveAver, actualAboveAver);
    }
}
