package Creational.AbstractFactory;

import Creational.AbstractFactory.factories.AbstractCarStaticFactory;
import Creational.AbstractFactory.factories.impl.AutoCarFactory;
import Creational.AbstractFactory.products.CyberCar;

public class Main implements AbstractCarStaticFactory{
    public static void main(String[] args) {
        AutoCarFactory factory = (AutoCarFactory) AbstractCarStaticFactory.createFactory("Auto");
        CyberCar car = factory.createCyberCar();
        System.out.println(car.drive());
    }
}
