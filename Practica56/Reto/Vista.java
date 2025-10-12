

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
public class Vista extends JFrame{
    private final JButton N0;
    private final JButton N1;
    private final JButton N2;
    private final JButton N3;
    private final JButton N4;
    private final JButton N5;
    private final JButton N6;
    private final JButton N7;
    private final JButton N8;
    private final JButton N9;
    private final JTextField display;
    private final JButton suma;
    private final JButton resta;
    private final JButton multiplicacion;
    private final JButton division;
    private final JButton borrar;
    private final JButton igual;

    public  Vista(String titulo) {
        //cremamos los objetos
        super(titulo);// Esto es de herencia
        N0=new JButton("0");
        N1=new JButton("1");
        N2=new JButton("2");
        N3=new JButton("3");
        N4=new JButton("4");
        N5=new JButton("5");
        N6=new JButton("6");
        N7=new JButton("7");
        N8=new JButton("8");
        N9=new JButton("9");
        suma=new JButton("+");
        resta=new JButton("-");
        multiplicacion=new JButton("x");
        division=new JButton("/");
        borrar=new JButton("C");
        igual=new JButton("=");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(640, 420));
        setLayout(new BorderLayout(10, 10));
        JPanel textoV= new JPanel();
        display=new JTextField(20); // aqui apareceran los numero signos etc etc etc et y mas etc pipipi
        display.setPreferredSize(new Dimension(600, 100));
        display.setEditable(false);
        textoV.add(display);

        JPanel botones=new JPanel(new GridLayout(4, 5, 5, 5));//filas,columnas,espacio horizontal, espacio vertical
       
        botones.add(N7);
        N7.setPreferredSize(new Dimension(60, 60));
        botones.add(N8);
        N8.setPreferredSize(new Dimension(60, 60));
        botones.add(N9);
        N9.setPreferredSize(new Dimension(60, 60));
        botones.add(borrar);
        borrar.setPreferredSize(new Dimension(60, 60));
        botones.add(igual);
        igual.setPreferredSize(new Dimension(60, 60));
        botones.add(N4);
        N4.setPreferredSize(new Dimension(60, 60));
        botones.add(N5);
        N5.setPreferredSize(new Dimension(60, 60));
        botones.add(N6);
        N6.setPreferredSize(new Dimension(60, 60));
        botones.add(multiplicacion);
        multiplicacion.setPreferredSize(new Dimension(60, 60));
        botones.add(division);
        division.setPreferredSize(new Dimension(60, 60));
        botones.add(N1);
        N1.setPreferredSize(new Dimension(60, 60));
        botones.add(N2);
        N2.setPreferredSize(new Dimension(60, 60));
        botones.add(N3);
        N3.setPreferredSize(new Dimension(60, 60));
        botones.add(suma);
        suma.setPreferredSize(new Dimension(60, 60));
        botones.add(resta);
        resta.setPreferredSize(new Dimension(60, 60));
        botones.add(new JPanel());
        botones.add(N0);;
        N0.setPreferredSize(new Dimension(60, 60));
        botones.add(new JPanel());
    
        add(textoV, BorderLayout.NORTH);
        add(botones, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public JButton getN0() {
        return N0;
    }

    public JButton getN1() {
        return N1;
    }

    public JButton getN2() {
        return N2;
    }

    public JButton getN3() {
        return N3;
    }

    public JButton getN4() {
        return N4;
    }

    public JButton getN5() {
        return N5;
    }

    public JButton getN6() {
        return N6;
    }

    public JButton getN7() {
        return N7;
    }

    public JButton getN8() {
        return N8;
    }

    public JButton getN9() {
        return N9;
    }

    public JTextField getDisplay() {
        return display;
    }

    public JButton getSuma() {
        return suma;
    }

    public JButton getResta() {
        return resta;
    }

    public JButton getMultiplicacion() {
        return multiplicacion;
    }

    public JButton getDivision() {
        return division;
    }

    public JButton getBorrar() {
        return borrar;
    }

    public JButton getIgual() {
        return igual;
    }
    
}

