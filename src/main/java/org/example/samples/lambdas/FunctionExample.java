package org.example.samples.lambdas;

import org.example.functional.interfaces.MyFunction;

public class FunctionExample {

  public static void main(String[] args) {
    show();
  }

  public static void show(){

    //Before refactor
    //MyFunction<String, Integer> toLength = s -> s.length();

    //After refactor
    MyFunction<String, Integer> toLength = String::length;

    Integer stringLength = toLength.apply("Some text");

    System.out.println(stringLength);
  }
}
