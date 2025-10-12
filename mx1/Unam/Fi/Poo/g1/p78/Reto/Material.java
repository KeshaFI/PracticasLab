public class Material {
    //generamos los atributtos
    private String titulo,autor;
    private int anio;
    //constructor
    public Material(String titulo,String autor, int anio){
        setTitulo(titulo);
        setAutor(autor);
        setAnio(anio);
    }


    //Generamos nuestros getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    @Override

    public String toString(){
        return "Titulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nAnio: " + getAnio();
    }
    public void mostrarInformacion(){
        System.out.println(toString());
    }












    
}
