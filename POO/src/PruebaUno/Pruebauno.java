
package PruebaUno;

import java.util.ArrayList;

class Pruebauno {
    public ArrayList<Integer> ArmarNuevoVector(ArrayList<Integer> vector, int permutacion){
        ArrayList<Integer>resultado = new ArrayList<>();
        for (int i = 0; i <vector.size(); i++) {
            int valorPrevio = (i==0)? 0:vector.get(i-1);
            int valorSig = (i== vector.size()-1)? 0:vector.get(i+1);

            if(valorPrevio==valorSig) resultado.add(0);
            else resultado.add(1);
        }

        if(permutacion>1)
            return  ArmarNuevoVector(resultado ,permutacion-1);
        return resultado;

    }

    public void imprimir(ArrayList<Integer>imprimir) {
        System.out.println("resultado ");
        for (int i:imprimir) {
            System.out.print(i+" ");
        }
    }
}
    

