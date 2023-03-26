# Tarea_UnaMas
# Notas:
* Este es mi repositorio: https://github.com/Marc20035/Tarea_UnaMas.git
# Ejercicios
## 1. Dado el fragmento de código C:
a) ¿Qué calcula la llamada a la función recursiva bisect(0,N)? Si cambiamos el 
valor de N, ¿qué estaríamos calculando? ¿Y si cambiásemos la función f(x)?

b) Implemente un algoritmo iterativo equivalente
### Respuesta: 

a) La función recursiva bisect implementa el método de bisección, un algoritmo de búsqueda de raíces de una función. 
La llamada a bisect(0, N) calcula la raíz cuadrada de N, que en este caso es 2. Si cambiamos el valor de N, estaríamos calculando la raíz cuadrada del nuevo valor de N. 
Si cambiamos la función f(x), estaríamos buscando una raíz de la nueva función en el intervalo proporcionado en la llamada a bisect.

b)

public class Bisection {

    static final double N = 2;
    static final double PREC = 1e-6;

    public static double f(double x) {
        return x * x - N;
    }

    public static double bisectIterative(double min, double max) {
        double med;
        while (max - min >= PREC) {
            med = (min + max) / 2;
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
        }
        return (min + max) / 2;
    }

    public static void main(String[] args) {
        double root = bisectIterative(0, N);
        System.out.printf("Raíz cuadrada de %.2f: %.8f\n", N, root);
    }
}

## 2. Dado el algoritmo recursivo:

a) Dado un número cualquiera x, ¿qué nos muestra por pantalla la llamada a la función 
recursiva f(x,2)? ¿Cuál sería un nombre más adecuado para la función f?

b) Implemente un algoritmo iterativo y uno implementado mediante expresiones lambda 
equivalentes.

### Respuesta: 

a) La función recursiva f toma dos argumentos: num y div. 
La función descompone num en sus factores primos y los muestra por pantalla. La llamada a f(x, 2) muestra los factores primos de x, comenzando desde el divisor 2. 
Un nombre más adecuado para la función f podría ser muestraPrimos.

b)
### Codigo con funciones Lambda:
import java.util.function.IntPredicate;

public class PrimeFactors {

    public static void main(String[] args) {
        int num = 12;

        IntPredicate isDivisible = div -> num % div == 0;

        for (int div = 2; num > 1; div++) {
            if (isDivisible.test(div)) {
                while (num % div == 0) {
                    System.out.println(div);
                    num /= div;
                }
            }
        }
    }
}

### Codigo iterativo

import java.util.function.IntPredicate;

public class PrimeFactors {

    public static void main(String[] args) {
        int num = 12;
        int div = 2;

        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }
}






