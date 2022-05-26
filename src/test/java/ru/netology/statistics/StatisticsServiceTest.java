package ru.netology.statistics;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findSecondMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 24, 5, 3, 8, 6, 11, 11, 12};
        long expected = 24;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findThirdMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 18, 21, 11, 19, 20};
        long expected = 21;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findFourthMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 5, 18, 4, 5};
        long expected = 18;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}

// ffffffffff