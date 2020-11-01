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
    public void increaseCurrentTemperature(){
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
    public void decreaseCurrrentTemperature(){
        Conditioner conditioner = new Conditioner();
        conditioner.setName("BlahBlah");
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(30);
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }
}