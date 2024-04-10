package com.tatiana.project.lesson23.observer;

import com.tatiana.project.lesson23.observer.Connection;

public interface Listener { // общий тип для всех наблюдателей за экземплярами Connection
    void execute(Connection connection);
}