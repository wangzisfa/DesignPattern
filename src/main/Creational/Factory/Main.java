package Creational.Factory;


import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) {
		Book book = new ScienceBook();
		System.out.println(book);
		System.out.println(book.getName());

		BookFactory factory = new BookFactoryImpl();
		try {
			Book factoryBook = factory.getOne(ScienceBook.class);
			System.out.println(factoryBook);
			System.out.println(factoryBook.getName());
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}

		//static factory
		Book englishBook = new EnglishBook("College EnglishBook");
		System.out.println(englishBook.getName());
	}
}
