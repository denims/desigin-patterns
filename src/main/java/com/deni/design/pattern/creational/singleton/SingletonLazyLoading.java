package com.deni.design.pattern.creational.singleton;

public class SingletonLazyLoading {

    private static volatile SingletonLazyLoading singletonLazyLoading;

    private SingletonLazyLoading() throws InstantiationException {
        if (singletonLazyLoading != null) {
            throw new InstantiationException("Initialize only via the getInstance method");
        }
    }

    public static SingletonLazyLoading getInstance() throws InstantiationException {
        if (singletonLazyLoading == null) {
            synchronized (SingletonLazyLoading.class) {
                if (singletonLazyLoading == null) {
                    singletonLazyLoading = new SingletonLazyLoading();
                }
            }
        }
        return singletonLazyLoading;
    }
}
