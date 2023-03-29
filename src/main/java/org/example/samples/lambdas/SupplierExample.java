package org.example.samples.lambdas;

import org.example.User;
import org.example.functional.interfaces.MySupplier;

public class SupplierExample {

  public static void main(String[] args) {
    show();
  }

  public static void show(){

    MySupplier<User> supplier = () -> new User("New user");

    User user = supplier.get();

    System.out.println(user.getName());
  }
}
