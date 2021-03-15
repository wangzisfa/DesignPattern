package Structural.Bridge.implement;

import Structural.Bridge.implement.Book;

public class MagicBook<String> implements Book<String> {
    private String magicWord;


    @Override
    public void bookMark(String mark) {
        this.magicWord = mark;
    }

    @Override
    public String readFromMark() {
        return magicWord;
    }
}
