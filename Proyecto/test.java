import java.util.Scanner;
import java.util.HashMap; //To be Implemented, Products are meant to be stored in a HashMap
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    HashMap<String, Product> Cart = new HashMap<>();

        int opcion = 0, cont = 0, price; 
        String name; 
        do{
            System.out.println("Bienvenido! Ingresa una de las siguientes opciones:");
            System.out.println("[1] - Mostrar Objetos\n[2] - Agregar Objetos\n[3] - Eliminar Objetos\n[4] - Salir");
            do{
                opcion = scan.nextInt();
                scan.nextLine();
            }while (opcion <0 || opcion>4);

            switch (opcion) {
                case 1:
                    if(cont == 0) System.out.println("Asegurate de haber ingresado al menos 1 objeto");
                    else Product.show(Cart);
                    break;
                case 2:
                    System.out.println("Ingresa el Nombre del Producto que Deseas Agregar: ");
                    name = scan.nextLine();
                    System.out.println("Ingresa el Precio del Producto que Deseas Agregar: ");
                    price = scan.nextInt();
                    Product item = new Product(name, price);
                    Product.Add(item, Cart);
                    cont++;
                    break;
                case 3:
                    if(cont == 0) System.out.println("Asegurate de haber ingresado al menos 1 objeto");
                    else Product.show(Cart);
                    System.out.println("Ingresa el Nombre del Producto que Deseas Eliminar:");
                    name = scan.nextLine();
                    Product.Delete(name, Cart);                    
                    break;
                case 4:
                    scan.close();
                    return;

                default:
                    break;
            }

        }while(true);
    }
}
