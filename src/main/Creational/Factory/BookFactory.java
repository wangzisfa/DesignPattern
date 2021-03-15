package Creational.Factory;

import java.lang.reflect.InvocationTargetException;

public interface BookFactory {
	Book getOne(Class<? extends Book> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;
}
