package Structural.composite;

public class ITStudent implements User {
    private String name;
    private String password;

    public ITStudent() {
    }

    public ITStudent(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User add(User user) {
        throw new UnsupportedOperationException("not supported");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Statement login() {
        return null;
    }

    @Override
    public Statement register() {
        return null;
    }

    @Override
    public Statement exit() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
