package mx1.Unam.Fi.Poo.p78;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class Circulo extends Figura {
    public void setRadio(double radio){
        this.radio = radio < 0 ? 0 : radio;
    }
    public Circulo(double radio) {
        setRadio(radio);
    }
    private double radio;
    public double getRadio() {
        return radio;
    }

    @Override 
    public double area() {
        return Math.PI * getRadio() * getRadio();
    }
    @Override 
    public double perimetro() {
        return 2 * Math.PI * getRadio();
    }
    @Override
    public void dibujar(Graphics2D g, Dimension size) {
        double margen = 20;
        double maxDiametroPanel = Math.min(size.width, size.height) - 2 * margen;
        double diametroFigura = 2 * Math.max(getRadio(), 1.0);
        double escala = maxDiametroPanel / diametroFigura;

        int d = (int) Math.round(2 * getRadio() * escala);
        int x = (size.width - d) / 2;
        int y = (size.height - d) / 2;
        g.drawOval(x, y, d, d);
    }
}