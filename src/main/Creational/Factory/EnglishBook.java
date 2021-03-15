package Creational.Factory;


//static factory
public class EnglishBook implements Book {
	private String name;

	public EnglishBook() {
	}

	public EnglishBook(String name) {
		this.name = name;
	}

	public static EnglishBook valueOf(String name) {
		return new EnglishBook(name);
	}


	@Override
	public Object getSize() {
		return null;
	}

	@Override
	public Object getBookMarks() {
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
