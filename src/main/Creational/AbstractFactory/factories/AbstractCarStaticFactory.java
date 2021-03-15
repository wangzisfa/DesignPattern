package Creational.AbstractFactory.factories;

import Creational.AbstractFactory.factories.impl.AutoCarFactory;
import Creational.AbstractFactory.factories.impl.BenzCarFactory;

public interface AbstractCarStaticFactory {
    static AbstractCarStaticFactory createFactory(String name) {
        if (name.equals("Auto")) {
            return new AutoCarFactory();
        } else if (name.equals("Benz")) {
            return new BenzCarFactory();
        } else {
            throw new IllegalArgumentException("error creating factory");
        }
    }
}
