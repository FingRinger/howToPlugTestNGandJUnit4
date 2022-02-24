package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainWhenLessThen1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual, "Wrong remain is counted");
    }
}