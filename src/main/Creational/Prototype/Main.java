package Creational.Prototype;

/*
* 原型模式就是深拷贝
* */

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche599XX", 1500, 33.2);
        Car car2 = car1.copy();

        if (car1.equals(car2)) {
            System.out.println("same car");
        }
    }
}
