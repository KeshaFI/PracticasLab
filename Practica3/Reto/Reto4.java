public class Reto4 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: java Reto4 a b c");
            return;
        }

        double a, b, c;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Introduce solo números (pueden ser decimales).");
            return;
        }

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
}
