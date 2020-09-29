package com.deni.design.pattern.creational.factory;

public class DemoFactory {
    public static Demo getDemo(String demoToCreate) {
        return switch (demoToCreate) {
            case "Demo1" -> new DemoImpl1();
            case "Demo2" -> new DemoImpl2();
            default -> null;
        };
    }
}
