package com.tatiana.project.lesson18;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class NullSafeContainer<T> {
    private T value;
    public NullSafeContainer(T value) {
        this.value = value;
    }

    public T getValueOr(Supplier<T> supplier) {
        if (value != null) return value;
        return supplier.get();
    }

    public void ifExists(Consumer<T> consumer, Runnable runnable) {
        if (value != null) consumer.accept(value);
        else runnable.run();
    }
}
//такой класс подходит для замены проверок на null
