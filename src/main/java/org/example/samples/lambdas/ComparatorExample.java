package org.example.samples.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

  public static void main(String[] args) {
    show();
  }

  public static void show() {

    List<String> list = new ArrayList<>();
    list.add("Order");
    list.add("By");
    list.add("Length");

    //Before refactoring
    //Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

    //After refactoring
    Comparator<String> byLength = Comparator.comparingInt(String::length);

    list.sort(byLength);
  }
}
