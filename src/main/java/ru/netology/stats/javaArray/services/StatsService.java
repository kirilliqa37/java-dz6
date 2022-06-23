package ru.netology.stats.javaArray.services;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int sum = 0;
        int average = 0;
        for (int j = 0; j < sales.length; j++) {
            sum += sales[j];
        }
        average = sum / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int y : sales) {
            if (y >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int h : sales) {
            if (h <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minNomberOfMonths(int[] sales) {
       int average = averageSalesAmount(sales);
       int minNomber = 0;
       for (int i = 0; i < sales.length; i++){
           if (sales[i] < average){
               minNomber++;
           }
       }
        return minNomber;
    }
    public int maxNomberOfMonths(int[] sales) {
        int average = averageSalesAmount(sales);
        int maxNomber = 0;
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > average){
                maxNomber++;
            }
        }
        return maxNomber;
    }

}


