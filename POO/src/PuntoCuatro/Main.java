/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoCuatro;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args) {
        String nombre = "Heinsohn";
        String extraer = "soh";

        Comparationk compa = new Comparationk();
        String resultado = compa.comparar(nombre,extraer);
        if(resultado.contentEquals(extraer)){ System.out.println(true);
                System.out.println(" "+resultado+"");
        }
                else{ 
        System.out.println(" "+resultado+"");
                        }
    }
    
}
