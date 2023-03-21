package org.example.Ejercicio5;

import java.util.Scanner;

public class MostrarMain {
    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        MaximoComunDivisor maximoComunDivisor = new MaximoComunDivisor();
        maximoComunDivisor.mcdLambda(a, b);
        maximoComunDivisor.mcdIterativo(a, b);
        maximoComunDivisor.mcdRecursivo(a, b);
    }
    public static void aux(){
        MostrarMain mostrarMain = new MostrarMain();
        mostrarMain.mostrar();
    }
}
