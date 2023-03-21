package org.example.Ejercicio3;
import java.util.Scanner;
public class Conversiones {
    public void convertirHexaBaseB(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número decimal:");
        int number = scanner.nextInt();
        Converter toHexadecimal = (n, b) -> {
            String hexDigits = "0123456789ABCDEF";
            String hex = "";
            while (n > 0) {
                hex = hexDigits.charAt(n % b) + hex;
                n /= b;
            }
            return hex;
        };
        String hexValue = toHexadecimal.convert(number, 16);
        System.out.println(number + " en base 10 es " + hexValue + " en base 16");


        System.out.println("Introduce una base B (entre 2 y 9):");
        int baseB = scanner.nextInt();
        if (baseB >= 2 && baseB <= 9) {
            Converter toBaseB = (n, b) -> {
                String result = "";

                while (n > 0) {
                    result = (n % b) + result;
                    n /= b;
                }

                return result;
            };

            String baseBValue = toBaseB.convert(number, baseB);
            System.out.println(number + " en base 10 es " + baseBValue + " en base " + baseB);
        } else {
            System.out.println("La base B debe estar entre 2 y 9.");
        }

        scanner.close();
    }

    @FunctionalInterface
    interface Converter {
        String convert(int n, int b);
    }
}
