package Creational.Factory;

import java.lang.reflect.InvocationTargetException;

public class BookFactoryImpl implements BookFactory{
	@Override
	public Book getOne(Class<? extends Book> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		return clazz.getDeclaredConstructor().newInstance();
	}
}
