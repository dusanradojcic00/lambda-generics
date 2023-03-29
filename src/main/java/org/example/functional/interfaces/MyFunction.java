package org.example.functional.interfaces;

@FunctionalInterface
public interface MyFunction<T, R> {

  R apply(T t);
}

