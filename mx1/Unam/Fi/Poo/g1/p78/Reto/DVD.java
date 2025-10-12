public class DVD extends Material{
    public Double duracion;

    public DVD(String titulo, String autor, int  anio, double duracion ){
        super(titulo, autor, anio);
        setDuracion(duracion);
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Duracion: " + getDuracion() +  " Min");
    }


    


    
}
