package Structural.Bridge;

import Structural.Bridge.abstracts.Library;
import Structural.Bridge.implement.Book;
import Structural.Bridge.implement.Coffee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

/*
* Client
* */

public class CityLibrary<T> extends Library<T> {
    public CityLibrary(List<Book<T>> bookList, Date endTime) {
        super(bookList, endTime);
    }

    public Coffee orderCoffee(String name) {
        try {
            String pack = Coffee.class.getPackageName();
            Class<?> clazz = Class.forName(pack + "." + name);
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            return (Coffee) constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
