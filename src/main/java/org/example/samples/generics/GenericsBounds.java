package org.example.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBounds {

  public static void main(String[] args) {
    show();
  }

  public static void show() {

    List<Integer> list = new ArrayList<>();

    addElement(list, 1);
    addElement(list, 2);
    addElement(list, 3);

    printList(list);

  }

  //  Does not work
  //  public static void addElement(List<? extends Integer> list, Integer number) {
  //    list.add(number);
  //  }

  public static void addElement(List<? super Integer> list, Integer number) {
    list.add(number);
  }

  public static void printList(List<? extends Integer> list) {
    list.forEach(System.out::println);
  }
}
