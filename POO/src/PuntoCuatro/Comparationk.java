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
public class Comparationk {
    public String comparar (String nombre, String extraer) {
        int inicio = nombre.indexOf("s");
        int fin = nombre.indexOf("h");
        return nombre.substring(inicio, fin + 1);
    }
}
