package org.example.samples.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListsGenerics {

  public static void main(String[] args) {
    show();
  }

  public static void show() {

    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(3);

    List<Double> doubles = new ArrayList<>();
    doubles.add(2.0);
    doubles.add(4.0);

    List<String> strings = new ArrayList<>();
    strings.add("Hello");
    strings.add("World");

    List<Number> numbersMerged = mergeTypeParameter(integers, doubles);

    numbersMerged.forEach(System.out::println);
  }

  public static <E> List<E> mergeTypeParameter(List<? extends E> listOne,
      List<? extends E> listTwo) {

    return Stream.concat(listOne.stream(), listTwo.stream())
        .collect(Collectors.toList());
  }
}
