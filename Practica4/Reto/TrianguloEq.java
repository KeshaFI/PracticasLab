import javax.swing.*;
import java.awt.*;

// Clase para manejar los cálculos del triángulo
class TrianguloEquilatero {
    private double x1, y1, x2, y2, x3, y3;

    public TrianguloEquilatero(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // Método para calcular distancia entre dos puntos
    private double distancia(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
    }

    // Método que revisa si es equilátero
    public boolean esEquilatero() {
        double lado1 = distancia(x1, y1, x2, y2);
        double lado2 = distancia(x2, y2, x3, y3);
        double lado3 = distancia(x3, y3, x1, y1);

        // Comparamos con una tolerancia por decimales
        double tolerancia = 0.0001;
        return (Math.abs(lado1 - lado2) < tolerancia &&
                Math.abs(lado2 - lado3) < tolerancia);
    }

    public String info() {
        return "Punto A: (" + x1 + "," + y1 + ")\n" +
               "Punto B: (" + x2 + "," + y2 + ")\n" +
               "Punto C: (" + x3 + "," + y3 + ")";
    }
}

// Clase principal con GUI
public class TrianguloEq extends JFrame {

    public TrianguloEq(String[] args) {
        setTitle("Verificar Triángulo Equilátero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Leer los puntos desde args
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double x3 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);

        // Crear objeto y verificar
        TrianguloEquilatero t = new TrianguloEquilatero(x1, y1, x2, y2, x3, y3);
        boolean resultado = t.esEquilatero();

        // Mostrar en ventana
        JPanel panel = new JPanel(new GridLayout(3, 1, 5, 5));
        panel.add(new JLabel("<html>" + t.info().replace("\n", "<br>") + "</html>", SwingConstants.CENTER));
        panel.add(new JLabel("¿Es equilátero?: " + (resultado ? "SÍ" : "NO"), SwingConstants.CENTER));

        add(panel);
    }

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Uso: java TrianguloEq x1 y1 x2 y2 x3 y3");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            new TrianguloEq(args).setVisible(true);
        });
    }
}