package com.tatiana.project.lesson18.task;

import com.tatiana.project.lesson18.IPay;

import java.util.function.Predicate;

@FunctionalInterface
public interface Notification {
    boolean send(String message);
    default Notification add (Notification next, Predicate<String> cond){
        return message -> {
            send(message);
           // if (next.equals(cond)) return next.send(message);
            if (cond.test(message)) next.send(message);
            return true;
        };
    }
}
