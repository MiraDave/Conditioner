package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

    @Test
    public void ShouldGetAndSet(){
        Conditioner conditioner = new Conditioner();
        String expected = "BlahBlah";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void CurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(25);
        int actual = conditioner.getCurrentTemperature();
        int expected = 25;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseCurrentTemperatureValid(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureInvalid(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrrentTemperatureValid(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrrentTemperatureInvalid() {
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }
}