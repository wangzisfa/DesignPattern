package Structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CollegeStudent implements User {
    private String name;
    private String password;
    private List<User> list = new ArrayList<>();

    public CollegeStudent() {
    }

    public CollegeStudent(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User add(User user) {
        list.add(user);
        return this;
    }

    public List<User> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Statement login() {
        return new Statement("200", "student login", "null");
    }

    @Override
    public Statement exit() {
        return new Statement("200", "student exit", "null");
    }

    @Override
    public Statement register() {
        return new Statement("200", "student register", "null");
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
