package org.example.functional.interfaces;

@FunctionalInterface
public interface MyComparator<T> {

  int compare(T o1, T o2);
}

