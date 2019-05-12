package com.deni.design.pattern.creational.singleton;

public class VehicleLazyLoading {

    private static volatile VehicleLazyLoading vehicleLazyLoading;

    private VehicleLazyLoading() throws InstantiationException {
        if (VehicleLazyLoading.vehicleLazyLoading != null) {
            throw new InstantiationException("Initialize only via the getInstance method");
        }
    }

    public static VehicleLazyLoading getInstance() throws InstantiationException {
        if (vehicleLazyLoading == null) {
            synchronized (VehicleLazyLoading.class) {
                if (vehicleLazyLoading == null) {
                    vehicleLazyLoading = new VehicleLazyLoading();
                }
            }
        }
        return vehicleLazyLoading;
    }
}
