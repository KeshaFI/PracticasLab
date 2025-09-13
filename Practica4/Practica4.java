public class Practica4 {
    public static void main(String[] args) {
        String tijera;
        Double [] datos=new Double[4];
        for(int i=0;i<args.length;i++){
            tijera=args[i];//x=10
            String []Guardar=tijera.split("=");
            datos[i]=Double.parseDouble(Guardar[1]);
        }

        Mensajes controlador = new Mensajes();

        Ventana ventana = new Ventana(controlador,datos);
        ventana.setVisible(true);
    }

}