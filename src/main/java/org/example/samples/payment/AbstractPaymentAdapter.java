package org.example.samples.payment;

import java.lang.reflect.ParameterizedType;
import java.util.function.Consumer;
import java.util.function.Function;
import org.example.functional.interfaces.ThrowingSupplier;

abstract class AbstractPaymentAdapter<E extends Exception> {

  private final Class<E> exceptionClass;

  @SuppressWarnings("unchecked")
  protected AbstractPaymentAdapter() {
    // Spring way
    // Class<?>[] types =
    // GenericTypeResolver.resolveTypeArguments(getClass(), AbstractPaymentAdapter.class);
    // this.exceptionClass = (Class<E>) Objects.requireNonNull(types)[0];

    //Pure Java way
    this.exceptionClass = (Class<E>) ((ParameterizedType) getClass()
        .getGenericSuperclass()).getActualTypeArguments()[0];
  }

  protected <T> T invokeProvider(ThrowingSupplier<T> supplier, Consumer<Exception> consumer) {
    return invokeProvider(supplier, consumer, Function.identity());
  }

  protected <R, T> R invokeProvider(ThrowingSupplier<T> supplier, Consumer<Exception> consumer,
      Function<T, R> resultMapper) {

    try {

      T response = supplier.get();

      return resultMapper.apply(response);

    } catch (Exception ex) {

      if (exceptionClass.isInstance(ex)) {

        consumer.accept(ex);

        throw new RuntimeException("An error has occurred with payment provider.");
      }

      throw new RuntimeException(ex);
    }
  }
}
