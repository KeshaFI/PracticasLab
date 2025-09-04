import java.util.Scanner;
public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion;
        System.out.print("Fila del triangulo de pascal que deseas: ");
        opcion= teclado.nextInt();
        trianguloPascal(opcion);
        teclado.close();
    }
    public static void trianguloPascal(int opcion){
        int []F={1};//inicializamos arreglo
        int i=1;
        //generamos espacio para imprimir fila
        while(i<=opcion){
            for(int j=0;j<opcion-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<F.length;k++){
                System.out.print(F[k]+ " ");
            }
            System.out.println();
            //generamos la fila nueva
            int []Fnueva=new int[F.length+1];
            Fnueva[0]=1;
            //generemos los nuevos valores y las colocamos en la Fnueva
            for(int n=1;n<F.length;n++){
                Fnueva[n]=F[n]+F[n-1];
                
            }
            Fnueva[Fnueva.length-1]=1;
            //copiamos la fila
            F=Fnueva;
            i+=1;
        }



    }
        
    
    
}

