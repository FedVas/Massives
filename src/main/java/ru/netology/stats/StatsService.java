package ru.netology.stats;

public class StatsService {

    public int sumAllSales(long[] sales) {
        long sum = 0;
        for (long t : sales) {
            if (0 <= sum) {
                sum += t;
            }
        }
        return (int) sum;
    }

    public int averageSum(long[] sales) {
        int sum = sumAllSales(sales);
        int howCells = sales.length;
        return sum / howCells;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverage(long[] sales) {
        int amountMonth = 0;
        for (long t : sales) {
            if (t < averageSum(sales)) {
                amountMonth++;
            }
        }
        return amountMonth;
    }

    public int aboveAverage(long[] sales) {
        int aboveMonth = 0;
        for (long t : sales) {
            if (t > averageSum(sales)) {
                aboveMonth++;
            }
        }
        return aboveMonth;
    }
}
