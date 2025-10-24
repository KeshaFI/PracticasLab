
public class EmpleadoPorComision extends Empleado {

    private double ventasNetas;
    private double tarifaComision;

    public EmpleadoPorComision(String name, String LastName, String Nss, double ventas, double tarifa) {

        super(name, LastName, Nss);

        setVentasNetas(ventas);
        setTarifaComision(tarifa);
    }


    public void setTarifaComision(double tarifa) {
        if (tarifa > 0.0 && tarifa <= 1.0) {
            this.tarifaComision = tarifa;
        } else {
           System.out.println("La tarifa de comisión debe estar entre 0 y 1");
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }


    public void setVentasNetas(double ventas) {
        if (ventas >= 0.0) {
            this.ventasNetas = ventas;
        } else {
            throw new IllegalArgumentException("Las ventas deben ser mayor a 0");
        }
    }

    public double getVentasNetas() {
        return ventasNetas;
    }


    @Override
    public double ingresos() {
        return getVentasNetas() * getTarifaComision();
    }

    @Override
    public String toString() {
        return String.format("Empleado por Comisión:\n%s\nVentas Netas: $%,.2f\nTarifa Comisión: %.2f",
                super.toString(), getVentasNetas(), getTarifaComision());
    }
}