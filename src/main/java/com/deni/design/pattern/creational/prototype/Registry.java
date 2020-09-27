package com.deni.design.pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static final Map<String, Prototypes> prototypesMap = new HashMap<>();

    static {
        prototypesMap.put("Proto1", new PrototypesImpl1());
        prototypesMap.put("Proto2", new PrototypesImpl2());
    }

    public static Prototypes getPrototype(String type) throws CloneNotSupportedException {
        Prototypes prototypes = prototypesMap.get(type);
        return (Prototypes) prototypes.clone();
    }


    private Registry() {
    }
}
