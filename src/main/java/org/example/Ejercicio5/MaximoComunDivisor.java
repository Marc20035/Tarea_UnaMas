package org.example.Ejercicio5;

import java.util.function.BiFunction;

public class MaximoComunDivisor {
    public int mcdRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcdRecursivo(b, a % b);
    }
    public int mcdIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public void mcdLambda(int a , int b){


        BiFunction<Integer, Integer, Integer> mcdLambda = (x, y) -> {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        };

        System.out.println(mcdLambda.apply(a, b));
    }
}

