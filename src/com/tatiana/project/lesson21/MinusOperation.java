package com.tatiana.project.lesson21;

import com.tatiana.project.lesson18.Operation;

public class MinusOperation implements Operation {
    @Override
    public double action(double a, double b) {
        return a - b;
    }
}