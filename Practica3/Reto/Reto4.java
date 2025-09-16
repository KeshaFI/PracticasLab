public class Reto4 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Reto4 a b c");
            return;
        }

        // Validar que los argumentos son números
        if (!esNumero(args[0]) || !esNumero(args[1]) || !esNumero(args[2])) {
            System.out.println("Introduce solo números (pueden ser decimales).");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser 0.");
            return;
        }

        double disc = b*b - 4*a*c;
        System.out.println("Discriminante = " + disc);

        if (disc > 0) {
            double r1 = (-b + Math.sqrt(disc)) / (2*a);
            double r2 = (-b - Math.sqrt(disc)) / (2*a);
            System.out.printf("Raices reales: x = %.2f y x = %.2f%n", r1, r2);
        } else if (disc == 0) {
            double r = -b/(2*a);
            System.out.printf("Raiz doble: x = %.2f%n", r);
        } else {
            double real = -b/(2*a);
            double imag = Math.sqrt(-disc)/(2*a);
            System.out.printf("Raices complejas: %.2f ± %.2fi%n", real, imag);
        }
    }

    // Método auxiliar para validar si una cadena es un número válido
    private static boolean esNumero(String s) {
        return s.matches("-?\\d+(\\.\\d+)?");
    }
}
