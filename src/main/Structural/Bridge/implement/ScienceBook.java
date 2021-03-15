package Structural.Bridge.implement;

import Structural.Bridge.implement.Book;

public class ScienceBook<Long> implements Book<Long> {
    private Long history;

    @Override
    public void bookMark(Long mark) {
        this.history = mark;
    }

    @Override
    public Long readFromMark() {
        return history;
    }
}
