package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainWhenLessThen1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remainWhenIsMoreThen1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1400;
        int expected = 600;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test // Bug
    public void remainWhenIs1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test // Bug
    public void remainWhenIs2000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 2000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}