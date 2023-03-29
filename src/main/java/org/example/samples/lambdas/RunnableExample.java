package org.example.samples.lambdas;

import org.example.functional.interfaces.MyRunnable;

public class RunnableExample {

  public static void main(String[] args) {
    show();
  }

  public static void show() {

    //    Runnable runnable = new Runnable() {
    //      @Override
    //      public void run() {
    //        System.out.println("I am inside anonymous class");
    //      }
    //    };
    //
    //    runnable.run();


    MyRunnable runnable = () -> System.out.println("I am inside lambda");

    runnable.run();
  }
}
