package ru.netology.stats;

public class StatsService {
    public int summaMoney(int[] array) {
        int sumMoney = 0;
        for (int i = 0; i < array.length; i++) {
            sumMoney = sumMoney + array[i];
        }
        return sumMoney;
    }

    public int averAmount(int[] array) {
        int averSumm = 0;
        for (int i = 0; i < array.length; i++) {
            averSumm = averSumm + array[i];
        }
        int average;
        average = averSumm / 12;
        return average;
    }

    public int maxSales(int[] array) {
        int maxMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minSales(int[] array) {
        int minMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int beloweAverage(int[] array) {
        int averSumm = averAmount(array);

        int summBelMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < averSumm) {
                int monthBelowAverage = 1;
                summBelMonth = summBelMonth + monthBelowAverage;
            }
        }
        return summBelMonth;
    }

    public int aboveAverage(int[] array) {
        int averSumm = averAmount(array);
        int summAvMonth = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > averSumm) {
                int monthAboveAverage = 1;
                summAvMonth = summAvMonth + monthAboveAverage;
            }
        }
        return summAvMonth;
    }
}
