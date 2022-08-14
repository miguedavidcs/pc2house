package Parte2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
     int puerta =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero de puertas del coche 1: "));
    Coche cocheObj= new Coche();
    cocheObj.Coche(puerta);
    cocheObj.mostrarResultados();
    }
    
   
   
}
