package Creational.AbstractFactory.products.impl;

import Creational.AbstractFactory.products.CyberCar;

public class AutoCar implements CyberCar {
    @Override
    public Object drive() {
        return "driving like shit";
    }

    @Override
    public Object fillGas() {
        return null;
    }
}
