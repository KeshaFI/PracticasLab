
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;


    public EmpleadoAsalariado(String name, String LastName, String Nss, double salario) {
        super(name, LastName, Nss);

        setSalarioSemanal(salario);
    }

    public void setSalarioSemanal(double salario) {
        if (salario >= 0.0) {
            this.salarioSemanal = salario;
        } else {
            System.out.println("El salario semanal debe ser mayor a 0");
        }
    }

   
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("Empleado Asalariado:\n%s\nSalario Semanal: $%,.2f",
                super.toString(), getSalarioSemanal());
    }
}