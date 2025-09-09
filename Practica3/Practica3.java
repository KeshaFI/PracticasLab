import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
public class Practica3{
    public static void main(String[] args) {
        ArrayList<String> palabra=new ArrayList<String>();
        for(int i=0; i<args.length;i++){
            palabra.add(args[i]);
        }
        HashMap<String,String>Datos=new HashMap<>();
        for(int j =0;j<palabra.size();j++){
            Datos.put(generaHash(palabra.get(j)), palabra.get(j));
        }
        for (var entry: Datos.entrySet() ){
            System.out.println("Clave:" + entry.getKey() + "    Valor: " + entry.getValue());
        }

    }  
    public static String generaHash(String texto) {
        // Crear la semilla a partir de la suma de los caracteres
        int semilla = 0;
        for (char c : texto.toCharArray()) {
            semilla += c;
        }

        Random random = new Random(semilla);
        
        // Generar 32 caracteres hexadecimales (simulando MD5)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int valor = random.nextInt(16); // 0 - F
            sb.append(Integer.toHexString(valor));
        }

        return sb.toString();
    }
}