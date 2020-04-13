package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Sky active 3");
        System.out.println(Car.NumberOfCars);
        Car car2 = new Car("Honda CRV","VTEC Turbo");
        System.out.println(Car.NumberOfCars);
        Car car3 = new Car("BMW 320i","BMW engine seri 3");
        System.out.println(Car.NumberOfCars);
    }
}
