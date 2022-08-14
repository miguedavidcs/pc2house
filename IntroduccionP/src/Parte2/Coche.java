
package Parte2;

public class Coche {
    int puerta;
    int cantidad=0;
    
    public void Coche(int puerta){
    cantidad+=puerta;
    }

    public void mostrarResultados(){
        System.out.println("El numero de puertas del Coche es de: "+cantidad);
    }
}
