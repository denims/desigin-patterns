package com.deni.design.pattern.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassToBuildTest {

    @Test
    void givenClassCreatedUsingBuilderShouldHaveTheSameParameters() {
        ClassToBuild classToBuild = new ClassToBuild.Builder()
                .withParam1("Hello")
                .withParam2("Test")
                .build();

        assertEquals("Hello", classToBuild.getParam1());
        assertEquals("Test", classToBuild.getParam2());
    }
}