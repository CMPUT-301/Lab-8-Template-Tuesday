package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Citytest {
    private City get_city(){
        return new City("j","k");
    }
    @Test
    public void test_city(){
        City city = get_city();
        assertEquals("jkk",city.getCityName());
    }
}
