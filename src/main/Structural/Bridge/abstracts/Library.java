package Structural.Bridge.abstracts;

import Structural.Bridge.implement.Book;

import java.util.Date;
import java.util.List;

public abstract class Library<T> extends BookStore<T> {
    private Date endTime;

    public Library(List<Book<T>> bookList, Date endTime) {
        super(bookList);
        this.endTime = endTime;
    }

    public Book<T> borrowBook(int index, Date endTime) {
        this.endTime = endTime;
        return this.buy(index);
    }

    public boolean isEndTime() {
        Date date = new Date();
        return date.equals(endTime);
    }
}
