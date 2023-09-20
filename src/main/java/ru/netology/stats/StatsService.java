package ru.netology.stats;

public class StatsService {
    public int getSumma(int[] sales) {
        int summa = 0;
        for (int sale : sales) {
            summa = summa + sale;
        }
        return summa;
    }

    public int getAverageSales(int[] sales) {
        return getSumma(sales) / sales.length;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int getSalesAboveAverage(int[] sales) {
        int aboveAverage = 0;
        int averageSale = getAverageSales(sales);
        for (int sale : sales) {
            if (averageSale < sale) {
                aboveAverage++;
            }
        }
        return aboveAverage;

    }

    public int getSalesBelowAverage(int[] sales) {
        int aboveAverage = 0;
        int averageSale = getAverageSales(sales);
        for (int sale : sales) {
            if (averageSale > sale) {
                aboveAverage++;
            }
        }
        return aboveAverage;

    }
}
