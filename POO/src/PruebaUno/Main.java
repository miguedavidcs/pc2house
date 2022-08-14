
package PruebaUno;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
            lista lista = new lista();
            Pruebauno pu = new Pruebauno();

            ArrayList<Integer>numeros=lista.Agregarlista();
            ArrayList<Integer>resultado;

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese las permutaciones ");
            int permutaciones = sc.nextInt();

            resultado= pu.ArmarNuevoVector(numeros,permutaciones);
            pu.imprimir(resultado);


    }
    
}
