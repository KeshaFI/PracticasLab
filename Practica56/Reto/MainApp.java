

import java.util.List;
import javax.swing.SwingUtilities;
public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            Vista ventana = new Vista("Calculadora :)");
            final double [] operacion={0};
            final String [] tipooperaciones={""};
            Calculadora calc=new Calculadora();
            ventana.setVisible(true);   
              ventana.getN0().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "0");

            });
            ventana.getN1().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "1");

            });
        
            ventana.getN2().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "2");

            });
            ventana.getN3().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "3");

            });
            ventana.getN4().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "4");

            });
            ventana.getN5().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "5");

            });
            ventana.getN6().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "6");

            });
            ventana.getN7().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "7");

            });
            ventana.getN8().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "8");

            });
              ventana.getN9().addActionListener(e->{
                ventana.getDisplay().setText(ventana.getDisplay().getText() + "9");

            });
            ventana.getSuma().addActionListener(e->{
                operacion[0]=Double.parseDouble(ventana.getDisplay().getText());
                tipooperaciones[0]="suma";
                ventana.getDisplay().setText("");

            });
            ventana.getIgual().addActionListener(e->{
                double numeronuevo = Double.parseDouble(ventana.getDisplay().getText());

                if (tipooperaciones[0].equals("suma")) {
                    calc.setSuma(operacion[0] + numeronuevo);
                    ventana.getDisplay().setText(String.valueOf(calc.getSuma()));
                }
            


            });
             ventana.getResta().addActionListener(e->{
                operacion[0]=Double.parseDouble(ventana.getDisplay().getText());
                tipooperaciones[0]="resta";
                ventana.getDisplay().setText("");

            });
            ventana.getIgual().addActionListener(e->{
                double numeronuevo = Double.parseDouble(ventana.getDisplay().getText());

                if (tipooperaciones[0].equals("resta")) {
                    calc.setResta(operacion[0] - numeronuevo);
                    ventana.getDisplay().setText(String.valueOf(calc.getResta()));
                }
            


            });
             ventana.getMultiplicacion().addActionListener(e->{
                operacion[0]=Double.parseDouble(ventana.getDisplay().getText());
                tipooperaciones[0]="multiplicacion";
                ventana.getDisplay().setText("");

            });
            ventana.getIgual().addActionListener(e->{
                double numeronuevo = Double.parseDouble(ventana.getDisplay().getText());

                if (tipooperaciones[0].equals("multiplicacion")) {
                    calc.setMultiplicacion(operacion[0] *numeronuevo);
                    ventana.getDisplay().setText(String.valueOf(calc.getMultiplicacion()));
                }
            


            });
             ventana.getDivision().addActionListener(e->{
                operacion[0]=Double.parseDouble(ventana.getDisplay().getText());
                tipooperaciones[0]="division";
                ventana.getDisplay().setText("");

            });
            ventana.getIgual().addActionListener(e->{
                double numeronuevo = Double.parseDouble(ventana.getDisplay().getText());

                if (tipooperaciones[0].equals("division")) {
                    calc.setDivision((operacion[0])/ numeronuevo);
                    ventana.getDisplay().setText(String.valueOf(calc.getDivision()));
                }
            


            });
            ventana.getBorrar().addActionListener(e -> {
                ventana.getDisplay().setText("");    
                operacion[0] = 0;                     
                tipooperaciones[0] = "";             
            });

            

        });
       
       
    }
}

