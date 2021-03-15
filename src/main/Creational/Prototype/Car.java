package Creational.Prototype;

import java.util.Objects;

public class Car {
    private String name;
    private double horsePower;
    private double price;

    public Car() {
    }

    public Car(String name, double horsePower, double price) {
        this.name = name;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Car copy() {
        Car car = new Car();
        this.name = car.name;
        this.horsePower = car.horsePower;
        this.price = car.price;

        return car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.horsePower, horsePower) == 0 &&
                Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, horsePower, price);
    }
}
