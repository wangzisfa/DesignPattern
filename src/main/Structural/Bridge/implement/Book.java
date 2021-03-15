package Structural.Bridge.implement;

public interface Book<T> {
    void bookMark(T mark);
    T readFromMark();
}
