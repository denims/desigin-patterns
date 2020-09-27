package com.deni.design.pattern.creational.prototype;

public abstract class Prototypes implements Cloneable{
    protected String property;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getProperty() {
        return property;
    }
}
