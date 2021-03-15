package Structural.Bridge.implement;

import Structural.Bridge.implement.Coffee;

public class Cappuccino implements Coffee {
    private static final String name = "Cappuccino";

    public Cappuccino() {
    }

    @Override
    public String toString() {
        return name;
    }
}
