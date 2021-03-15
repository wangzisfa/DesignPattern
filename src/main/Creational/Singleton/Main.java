package Creational.Singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

    }



    private myInterface func() {
        AtomicInteger number = new AtomicInteger(1);
        return (() -> {
            System.out.println(number.incrementAndGet());
        });
    }
}
