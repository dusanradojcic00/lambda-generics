package org.example.samples.lambdas;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import org.example.User;
import org.example.functional.interfaces.MyConsumer;
import org.example.functional.interfaces.MyFunction;

public class MethodReferenceExample {

  public static void main(String[] args) {
    show();
  }


  public static void show() {

    staticMethodReference();
    unboundMethodReference();
    boundMethodReference();
    constructorMethodReference();

  }

  private static void staticMethodReference() {

    //IntBinaryOperator maxCalculator = (a, b) -> Integer.max(a, b);
    IntBinaryOperator maxCalculator = Integer::max;

    int max = maxCalculator.applyAsInt(5, 10);
  }

  private static void unboundMethodReference() {
    //Function<String, Integer> toLength = s -> s.length();
    MyFunction<String, Integer> toLength = String::length;

    Integer length = toLength.apply("Calculate my length");
  }

  private static void boundMethodReference() {

    User user = new User("UserName");

    //MyConsumer<String> setUserName = s -> user.setName(s);
    MyConsumer<String> setUserName = user::setName;

    setUserName.accept("UserName");


    //MyConsumer<String> printString = s -> System.out.println(s);
    MyConsumer<String> printString = System.out::println;

    printString.accept("Print me");
  }

  private static void constructorMethodReference() {

    //MyFunction<String, User> createUser = name -> new User(name);
    MyFunction<String, User> createUser = User::new;

    User newUser = createUser.apply("NewUser");
  }
}
