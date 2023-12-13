package ru.netology.stats;

public class StatsService {
    public int summaMoney(int[] sale) {
        int sumMoney = 0;
        for (int i = 0; i < sale.length; i++) {
            sumMoney += sale[i];
        }
        return sumMoney;
    }

    public int averAmount(int[] sale) {
        int averSumm = summaMoney(sale);
        int average;
        average = averSumm / 12;
        return average;
    }

    public int maxSales(int[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minSales(int[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int beloweAverage(int[] sale) {
        int summBelMonth = 0;
        int averSumm = averAmount(sale);
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averSumm) ;
            summBelMonth++;
        }
        return summBelMonth;
    }

    public int aboveAverage(int[] sale) {
        int summAvMonth = 0;
        int averSumm = averAmount(sale);
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averSumm) {
                summAvMonth++;
            }
        }
        return summAvMonth;
    }
}
