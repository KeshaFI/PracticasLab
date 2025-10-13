public class Revista extends Material{
    private String Edicion;

    public Revista(String Titulo, String autor, int anio, String Edicion){
        super(Titulo, autor, anio);
        setEdicion(Edicion);
    }
    public String getEdicion() {
        return Edicion;
    }
    public void setEdicion(String edicion) {
        Edicion = edicion;
    }
    
      @Override

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Edicion: " + getEdicion());
    }

}
    

