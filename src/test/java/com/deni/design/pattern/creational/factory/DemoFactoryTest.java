package com.deni.design.pattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoFactoryTest {

    @Test
    void givenDemo1AsMessageShouldCreateDemo1Object() {
        Demo demo = DemoFactory.getDemo("Demo1");
        assertTrue(demo instanceof DemoImpl1);
    }

    @Test
    void givenDemo2AsMessageShouldCreateDemo2Object() {
        Demo demo = DemoFactory.getDemo("Demo2");
        assertTrue(demo instanceof DemoImpl2);
    }
}