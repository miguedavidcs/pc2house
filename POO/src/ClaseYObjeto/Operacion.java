
package ClaseYObjeto;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributo
    int n1;
    int n2;
    int suma;
    int resta;
    int producto;
    int division;
    
    //Metodos
    
    // Metodo que pide dos numero para que los digite
    public void leerNumeros(){
        n1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
    }
    public void suma(){
        suma=n1+n2;
        
    }
    public void resta(){
        resta=n1-n2;
    }
    public void producto(){
        producto =n1*n2;
    }
    public void division(){
        division =n1/n2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es: "+producto);
        System.out.println("La division es: "+division);
    }
}
