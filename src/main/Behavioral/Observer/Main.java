package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();
        messageSender.addObserver(new Admin() {
            @Override
            public void notice() {
                System.out.println("unnamed Admin has been noticed!");
            }
        });
        messageSender.addObserver(new User());
        messageSender.addObserver(new Admin());
        messageSender.noticeAll();
    }
}