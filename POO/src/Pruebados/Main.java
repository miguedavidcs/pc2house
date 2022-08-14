
package Pruebados;

import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Digite primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Digite segundo numero: ");
        n2 = sc.nextInt();
        System.out.print("Digite tercer numero: ");
        n3 = sc.nextInt();

        Integer[] Nnumeros = { n1, n2, n3 };
        NumeroMayor nMX = new NumeroMayor();
        System.out.println("el mas alto "+ nMX.nMax(Nnumeros));
    } 
}
