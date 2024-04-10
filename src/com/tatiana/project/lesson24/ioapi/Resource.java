package com.tatiana.project.lesson24.ioapi;

import java.io.IOException;

public class Resource implements AutoCloseable {

    public void resourceVoid() throws IOException {
        System.out.println("методы работы с ресурсом");
    }


    @Override
    public void close() {
        System.out.println("закрытие ресурса");
    }
}

