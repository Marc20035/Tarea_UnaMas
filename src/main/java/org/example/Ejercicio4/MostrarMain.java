package org.example.Ejercicio4;

import java.util.Scanner;

public class MostrarMain {
    public void mostrarMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la palabra a comprobar:");
        String word = scanner.nextLine();
        Palindromo palindromo = new Palindromo();
        System.out.println(palindromo.esPalindromoRecursivo(word, 0, word.length() - 1));
        System.out.println(palindromo.esPalindromoIterativo(word));
    }
    public static void aux() {
        MostrarMain mostrarMain = new MostrarMain();
        mostrarMain.mostrarMain();
    }
}
