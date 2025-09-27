import java.util.HashMap;
public class Product{
    int precio;
    String name;
    public  Product(String name, int precio){
        this.name = name;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return name + " - - - " + precio + "$";
    }

    public static void show(HashMap<String, Product> cart) {
        int i = 1;
        for (Product p : cart.values()) {
            System.out.println("[" + i + "] " + p);
            i++;
        }
    }

    public static boolean Add(Product toAdd, HashMap<String, Product> Cart){
    Cart.put(toAdd.name, toAdd);
           return true;
    }

    public static void Delete(String toDelete, HashMap<String, Product> Cart){
        Cart.remove(toDelete);
        return;
    }
}