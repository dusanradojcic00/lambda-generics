package org.example.functional.interfaces;

@FunctionalInterface
public interface MyPredicate<T> {

  boolean test(T t);
}

