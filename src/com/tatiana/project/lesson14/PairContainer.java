package com.tatiana.project.lesson14;

import java.time.temporal.Temporal;

public class PairContainer<K, V> {
    private K key;
    private V value;

    public PairContainer(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
// PairContainer<String, User<Number>> pairContainer = new PairContainer<>();

