package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testGetProvinceName()(){
        City city = mockCity();
        assertEquals("Edmonton", city.getCityName());
    }
}
