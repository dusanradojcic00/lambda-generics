package org.example.samples.lambdas;

import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {
    simple();
    chaining();
  }

  public static void simple(){

    String s1 = "String";
    String s2 = "";


    Predicate<String> isBlank = s -> s.length() == 0;

    boolean result1 = isBlank.test(s1);
    boolean result2 = isBlank.test(s2);

    System.out.println("Results: ");
    System.out.println(s1 + " isBlank: " + result1);
    System.out.println(s2 + " isBlank: " + result2);


  }

  private static void chaining(){

    Predicate<String> isLongerThanFive = s -> s.length() > 5;
    Predicate<String> isShorterThanTen = s -> s.length() < 10;

    Predicate<String> isBetweenFiveAndTen = isLongerThanFive.and(isShorterThanTen);

    String s1 = "Length7";
    String s2 = "bad";

    System.out.println("Results: ");
    System.out.println(s1 + " isBetweenFiveAndTen: " + isBetweenFiveAndTen.test(s1));
    System.out.println(s2 + " isBetweenFiveAndTen: " + isBetweenFiveAndTen.test(s2));
  }
}
