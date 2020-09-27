package com.deni.design.pattern.creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void givenTwoInstancesShouldBeDifferentAndClones() throws CloneNotSupportedException {
        Prototypes prototypes1 = Registry.getPrototype("Proto1");
        Prototypes prototypes2 = Registry.getPrototype("Proto1");

        assertNotEquals(prototypes1, prototypes2);
        assertEquals(prototypes1.getProperty(), prototypes2.getProperty());
    }
}