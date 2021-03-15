package Creational.AbstractFactory.factories.impl;

import Creational.AbstractFactory.factories.AbstractCarStaticFactory;
import Creational.AbstractFactory.products.CyberCar;
import Creational.AbstractFactory.products.Truck;
import Creational.AbstractFactory.factories.AbstractCarFactory;
import Creational.AbstractFactory.products.impl.BenzCar;
import Creational.AbstractFactory.products.impl.BenzTruck;

public class BenzCarFactory implements AbstractCarFactory, AbstractCarStaticFactory {
    @Override
    public CyberCar createCyberCar() {
        return new BenzCar();
    }

    @Override
    public Truck createTruck() {
        return new BenzTruck();
    }
}
