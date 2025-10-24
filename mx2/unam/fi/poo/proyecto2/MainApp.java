
public class MainApp {

    public static void main(String[] args) {

        System.out.println("EMPLEADOS DE LA EMPRESA");
        System.out.println(" ");

    
        Empleado emp1 = new EmpleadoAsalariado(
                "Ana", "López", "123-456-789", 8000.00
        );

        Empleado emp2 = new EmpleadoPorComision(
                "Carlos", "Ruiz", "987-654-321", 50000.00, 0.10
        );
        
        Empleado emp3 = new EmpleadoAsalariado(
                "Laura", "García", "111-222-333", 12000.00
        );

        Empleado[] empleados = new Empleado[3];
        empleados[0] = emp1;
        empleados[1] = emp2;
        empleados[2] = emp3;



        
        System.out.println("\nProcesando empleados de forma polimórfica:\n");
        
        for (Empleado empActual : empleados) {
            
     
            System.out.println(empActual);

            System.out.printf("Ingresos Semanales: $%,.2f\n", empActual.ingresos());
            
            System.out.println("  ");
        }
    }
}