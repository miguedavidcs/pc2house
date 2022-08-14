/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;


import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        int n1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        int n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n3 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        Numeros op= new Numeros();
        op.suma(n1, n2, n3);
        op.mostrarResultados();
        
    }
    
}
