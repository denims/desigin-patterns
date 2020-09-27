package com.deni.design.pattern.creational.builder;

public class ClassToBuild {

    private final String param1;
    private final String param2;

    private ClassToBuild(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public String getParam1() {
        return param1;
    }

    public String getParam2() {
        return param2;
    }


    public static class Builder {
        private String param1;
        private String param2;

        public Builder withParam1(String param1) {
            this.param1 = param1;
            return this;
        }

        public Builder withParam2(String param2) {
            this.param2 = param2;
            return this;
        }

        public ClassToBuild build() {
            return new ClassToBuild(param1, param2);
        }
    }
}
