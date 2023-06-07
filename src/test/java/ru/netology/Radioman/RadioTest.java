package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNextChanel() {
        Radio radio = new Radio();
        radio.setNewChannel(8);
        radio.nextChannel();

        int expected = 9;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelNineToZero() {
        Radio radio = new Radio();
        radio.setNewChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevChanel() {
        Radio radio = new Radio();
        radio.setNewChannel(6);
        radio.prevChannel();

        int expected = 5;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeChanelZeroToNine() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.prevChannel();

        int expected = 9;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewChanel() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.setNewChannel(5);

        int expected = 5;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelAboveNine() {
        Radio radio = new Radio();
        radio.setNewChannel(0);
        radio.setNewChannel(12);

        int expected = 0;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelBelowZero() {
        Radio radio = new Radio();
        radio.setNewChannel(4);
        radio.setNewChannel(-2);

        int expected = 4;
        int actual = radio.getNumberCurrentChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldTurnUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.turnUpVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnUpAboveTenVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);
        radio.turnDownVolume();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownLessZeroVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void newshouldNotTurnDownLessZeroVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
