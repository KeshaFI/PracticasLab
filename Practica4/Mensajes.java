import javax.swing.*;

public class Mensajes {

    public String mensaje() {
        try {
            int x1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa x1:"));
            int y1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa y1:"));
            Puntos p1 = new Puntos(x1, y1);

            int x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa x2:"));
            int y2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa y2:"));
            Puntos p2 = new Puntos(x2, y2);

            double distancia = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));

            return "La distancia entre " + p1 + " y " + p2 + " es: " + String.format("%.2f", distancia);

        } catch (NumberFormatException e) {
            return "Debes ingresar solo números enteros.";
        }
    }
}
