
public abstract class Empleado {

    private String name;
    private String LastName;
    private String Nss;

    public Empleado(String name, String LastName, String Nss) {
        this.name = name;
        this.LastName = LastName;
        this.Nss = Nss;
    }


    public abstract double ingresos();

    @Override
    public String toString() {
        return String.format("Empleado: %s %s\nNSS: %s",
                getname(), getLastName(), getNss());
    }



    public String getname() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getNss() {
        return Nss;
    }

}