package org.example.functional.interfaces;

@FunctionalInterface
public interface ThrowingSupplier<T> {

  T get() throws Exception;
}
