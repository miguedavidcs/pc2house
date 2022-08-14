/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebatres;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args) {
        int[] numeros = { 15, 7, 2, 1, 5, 9, 8, 7, 24, 50 };
        OrderArr or = new OrderArr();
        System.out.println("ordenado "+or.ObtenerOrden(numeros));
    }
}
