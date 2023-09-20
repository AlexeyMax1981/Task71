package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldGetSumma() {
        StatsService service = new StatsService();
        int[] sales = {24, 14, 15, 3};
        int expected = 56;
        int actual = service.getSumma(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageSales() {
        int[] sales = {24, 14, 15, 3};
        StatsService service = new StatsService();
        int expected = 14;
        int actual = service.getAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxMonth() {
        int[] sales = {24, 14, 15, 35};
        StatsService service = new StatsService();
        int expected = 3;
        int actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinMonth() {
        int[] sales = {24, 14, 15, 35};
        StatsService service = new StatsService();
        int expected = 1;
        int actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalesAboveAverage() {
        int[] sales = {24, 14, 15, 35, 71};
        StatsService service = new StatsService();
        int expected = 2;
        int actual = service.getSalesAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSalesBelowAverage() {
        int[] sales = {24, 14, 15, 35, 71};
        StatsService service = new StatsService();
        int expected = 3;
        int actual = service.getSalesBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
