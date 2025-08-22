import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\nElige una opción");
            System.out.println("1) Conjetura de Collatz");
            System.out.println("2) Número factorial");
            System.out.println("3) Serie de Fibonacci");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero positivo: ");
                     int c = scanner.nextInt();
                    System.out.println("Secuencia de Collatz para " + c + ":");
                    collatz(c);
                    break;
                case 2:
                    System.out.print("Ingrese un número entero no negativo: ");
                    int n = scanner.nextInt();
                    long resultado = factorialRecursivo(n);
                    System.out.println(n + "! = " + resultado);
                    break;
                case 3:
                    System.out.print("¿Cuántos términos de Fibonacci deseas? ");
                    int m = scanner.nextInt();
        
                    System.out.println("Serie de Fibonacci:");
                    for (int i = 0; i < m; i++) {
                    System.out.print(fibonacciRecursivo(i) + " ");
                    }
                    break;
                case 4:
                    System.out.println("¡Adios!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
        } while (opcion != 4);
        
        scanner.close();
    }
    
    
    public static void collatz(int c) {
        while (c != 1) {
            System.out.print(c + "\t");
            if (c % 2 == 0) {
                c = c / 2;
            } else {
                c = 3 * c + 1;
            }
        }
        System.out.println("1");
    }
    
    public static int factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
    public static int fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }    
}