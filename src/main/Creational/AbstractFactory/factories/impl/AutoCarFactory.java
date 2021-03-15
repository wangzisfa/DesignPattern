package Creational.AbstractFactory.factories.impl;

import Creational.AbstractFactory.factories.AbstractCarStaticFactory;
import Creational.AbstractFactory.products.CyberCar;
import Creational.AbstractFactory.products.Truck;
import Creational.AbstractFactory.factories.AbstractCarFactory;
import Creational.AbstractFactory.products.impl.AutoCar;
import Creational.AbstractFactory.products.impl.AutoTruck;

public class AutoCarFactory implements AbstractCarFactory, AbstractCarStaticFactory {
    @Override
    public CyberCar createCyberCar() {
        return new AutoCar();
    }

    @Override
    public Truck createTruck() {
        return new AutoTruck();
    }
}
