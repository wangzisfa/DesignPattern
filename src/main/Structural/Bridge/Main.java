package Structural.Bridge;

import Structural.Bridge.implement.Book;
import Structural.Bridge.implement.Coffee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book<Long>> books = new ArrayList<>();
        Date date = new Date();

//        System.out.println(new Date().toString());
        CityLibrary<Long> library = new CityLibrary(books, date);
        Coffee coffee = library.orderCoffee("Cappuccino");
        System.out.println(coffee.toString());

//        System.out.println(Main.class.getPackageName());
    }
}
