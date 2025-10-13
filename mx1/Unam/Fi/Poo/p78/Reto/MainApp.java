public class MainApp {
    public static void main(String[] args) {
        Revista revista= new Revista( "LA JORNADA", "Ricardo Anaya", 2018, " PRIAN");
        Libro libro= new Libro("Critica de la razon pura", "Immanuel Kant", 1781, 784);
        DVD Dvd= new DVD("Pokoyo", " David Cantolla, Luis Gallego y Guillermo García Carsí", 2005, 30);
        
        revista.mostrarInformacion();
        System.out.println();
        libro.mostrarInformacion();
        System.out.println();
        Dvd.mostrarInformacion();
        System.out.println();
    }
    
}
