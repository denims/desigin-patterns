package com.deni.design.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyLoadingTest {

    @Test
    void givenTwoInstancesShouldBeSameWhenUsingLazilyLoadedSingleton() throws InstantiationException {
        SingletonLazyLoading singletonLazyLoadingFirst = SingletonLazyLoading.getInstance();
        SingletonLazyLoading singletonLazyLoadingSecond = SingletonLazyLoading.getInstance();

        assertEquals(singletonLazyLoadingFirst, singletonLazyLoadingSecond);
    }
}