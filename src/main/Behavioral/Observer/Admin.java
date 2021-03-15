package Behavioral.Observer;

public class Admin implements Observer {
    @Override
    public void notice() {
        System.out.println("admin has been noticed!");
    }
}
