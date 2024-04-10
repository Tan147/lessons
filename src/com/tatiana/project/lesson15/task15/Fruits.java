package com.tatiana.project.lesson15.task15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public class Fruits<E> implements Collection<E> {
    private E[] elements;
    private int size = 0;

    public Fruits() {
        elements = (E[]) new Object[10];
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            elements = ArrayList.copyOf(elements, size * 2);
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                   return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                return true;
            }
        }
        return false;
    }
}
