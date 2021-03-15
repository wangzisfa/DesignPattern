package Structural.Bridge.abstracts;

import Structural.Bridge.implement.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class BookStore<T> {
    List<Book<T>> bookList = new ArrayList<>();

    public BookStore() {
    }

    public BookStore(List<Book<T>> bookList) {
        this.bookList = bookList;
    }

    public Book<T> buy(int index) {
        if (index > bookList.size()) {
            throw new ArrayIndexOutOfBoundsException("out of bounds");
        } else {
            return bookList.get(index);
        }
    }
}
