package org.example.functional.interfaces;

@FunctionalInterface
public interface MyConsumer<T> {

  void accept(T t);
}

