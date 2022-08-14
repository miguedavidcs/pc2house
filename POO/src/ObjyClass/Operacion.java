/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjyClass;

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
        
    }
    public void suma(int n1, int n2){
        suma=n1+n2;
        
    }
    public void resta(int n1, int n2){
        resta=n1-n2;
    }
    public void producto(int n1, int n2){
        producto =n1*n2;
    }
    public void division(int n1, int n2){
        division =n1/n2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es: "+producto);
        System.out.println("La division es: "+division);
    }
}
