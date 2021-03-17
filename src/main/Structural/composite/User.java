package Structural.composite;

import Structural.composite.Statement;

public interface User {
    Statement login();
    Statement register();
    Statement exit();
    User add(User user);
    String getName();
    String getPassword();
}