package org.example.samples.lambdas;

import org.example.functional.interfaces.MyConsumer;

public class ConsumerExample {

  public static void main(String[] args) {
    show();
  }

  public static void show(){

    //Before refactor
    //MyConsumer<String> consumer = (s) -> System.out.println(s);

    //After refactor
    MyConsumer<String> consumer = System.out::println;

    consumer.accept("Hello");

  }
}
