package com.tatiana.project.lesson23.decorator;

public interface AppLogger { // общий для классов с основным и дополнительным функционалом
    void log(String message);
}