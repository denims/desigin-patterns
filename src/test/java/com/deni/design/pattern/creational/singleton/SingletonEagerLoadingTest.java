package com.deni.design.pattern.creational.singleton;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerLoadingTest {


    @Test
    @Description("Two instances of singleton object should be same")
    void givenTwoInstancesShouldBeSame() {
        SingletonEagerLoading singletonEagerLoadingFirst = SingletonEagerLoading.getInstance();
        SingletonEagerLoading singletonEagerLoadingSecond = SingletonEagerLoading.getInstance();

        assertEquals(singletonEagerLoadingFirst, singletonEagerLoadingSecond);
    }
}