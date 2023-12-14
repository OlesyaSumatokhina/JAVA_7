package ru.netology.stats;

public class StatsService {
    public int summaMoney(int[] sales) {
        int sumMoney = 0;
        for (int i = 0; i < sales.length; i++) {
            sumMoney += sales[i];
        }
        return sumMoney;
    }

    public int averAmount(int[] sales) {
        int averSumm = summaMoney(sales);
        int average;
        average = averSumm / 12;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int beloweAverage(int[] sales) {
        int summBelMonth = 0;
        int averSumm = averAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumm) {
                summBelMonth++;
            }
        }
        return summBelMonth;
    }

    public int aboveAverage(int[] sales) {
        int summAvMonth = 0;
        int averSumm = averAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averSumm) {
                summAvMonth++;
            }
        }
        return summAvMonth;


    }
}
