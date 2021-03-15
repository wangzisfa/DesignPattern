package Creational.AbstractFactory.factories;

/*
* 抽象工厂分为屏蔽实际工厂方法和普通工厂方法
* */

import Creational.AbstractFactory.products.CyberCar;
import Creational.AbstractFactory.products.Truck;

public interface AbstractCarFactory {
    CyberCar createCyberCar();
    Truck createTruck();
}
