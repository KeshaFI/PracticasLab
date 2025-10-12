
public class Libro extends Material {
    //atributo unico de libro
    private int paginas;
    
    public Libro(String titulo, String autor, int anio,int paginas ){
        super(titulo, autor, anio);
        setPaginas(paginas);

    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        if(paginas>=0){
          this.paginas = paginas;  
        }
    }
    @Override

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Paginas: " + getPaginas());

    }

    


    
}
