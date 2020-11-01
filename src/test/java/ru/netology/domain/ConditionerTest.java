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
        Conditioner condition = new Conditioner();
        condition.setName("BlahBlah");
        condition.setMaxTemperature(30);
        condition.setMinTemperature(30);
        condition.setOn(true);
        condition.setCurrentTemperature(25);
        condition.increaseCurrentTemperature();
        assertEquals(17, condition.getCurrentTemperature());

    }
}
