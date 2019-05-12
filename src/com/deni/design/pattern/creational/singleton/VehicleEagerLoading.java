package com.deni.design.pattern.creational.singleton;

public class VehicleEagerLoading {

    private static VehicleEagerLoading vehicleEagerLoading = new VehicleEagerLoading();

    private VehicleEagerLoading() {}

    public static VehicleEagerLoading getInstance() {
        return vehicleEagerLoading;
    }
}
