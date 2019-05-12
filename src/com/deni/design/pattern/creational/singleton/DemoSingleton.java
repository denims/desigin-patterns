package com.deni.design.pattern.creational.singleton;

public class DemoSingleton {

    public static void main(String[] args) throws InstantiationException {
        VehicleLazyLoading vehicleLazyLoading = VehicleLazyLoading.getInstance();
        VehicleLazyLoading vehicleLazyLoading2 = VehicleLazyLoading.getInstance();

        System.out.println(vehicleLazyLoading.equals(vehicleLazyLoading2));

        VehicleEagerLoading vehicleEagerLoading = VehicleEagerLoading.getInstance();
        VehicleEagerLoading vehicleEagerLoading2 = VehicleEagerLoading.getInstance();

        System.out.println(vehicleEagerLoading.equals(vehicleEagerLoading2));

    }
}
