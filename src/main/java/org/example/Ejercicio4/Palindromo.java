package org.example.Ejercicio4;

public class Palindromo {
    public boolean esPalindromoRecursivo(String cadena, int inicio, int fin){
        if (inicio >= fin) {
            return true;
        }
        if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        }
        return esPalindromoRecursivo(cadena, inicio + 1, fin - 1);
    }

    public boolean esPalindromoIterativo(String cadena){
        int inicio = 0;
        int fin = cadena.length() - 1;
        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
}
