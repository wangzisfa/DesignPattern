package Behavioral.Observer;

public class User implements Observer {
    @Override
    public void notice() {
        System.out.println("user has been noticed!");
    }
}
