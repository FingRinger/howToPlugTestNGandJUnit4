package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfAmountLessThen1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(actual, expected, "Wrong remain is counted");
    }

    @Test // Если пользователь купил ровно на 1000 рублей, то приложение не должно ему говорить, что нужно купить ещё на 1000.
    public void testRemainIfAmountIs1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected, "Wrong remain is counted");
    }

    @Test
    public void testRemainIfAmountMoreThen1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1400;
        int expected = 600;

        int actual = service.remain(amount);

        assertEquals(actual, expected, "Wrong remain is counted");
    }

    @Test
    public void testRemainIfAmountIs2000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 2000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected, "Wrong remain is counted");
    }

}