
import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    JButton boton;
    Mensajes controlador;
    Double[] datos;

    public Ventana(Mensajes controlador, Double[] datos) {
        this.controlador = controlador;
        this.datos = datos;

        setTitle("Ejemplo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        boton = new JButton("Haz clic aqui");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Puntos p1 = new Puntos(datos[0].intValue(), datos[1].intValue());
                Puntos p2 = new Puntos(datos[2].intValue(), datos[3].intValue());
                double distancia = Math.sqrt(
                    Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2)
                );

                // Usar el método mensaje con parámetros
                String mensaje = controlador.mensaje(p1, p2, distancia);

                JOptionPane.showMessageDialog(null, mensaje);
            }
        });

        add(boton);
    }
}