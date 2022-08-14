
package src;

import java.util.*;

public class CuentasUsuarios {
    public static void main(String[]args){
        Cliente cl1= new Cliente("Miguel David","0001",200000);
        Cliente cl2= new Cliente("Yuliana del Carmen","0002",250000);
        Cliente cl3= new Cliente("Abraham David","0003",300000);
        Cliente cl4= new Cliente("Miguel Castaño","0004",400000);
        /*
        Crearemos un Objeto instanciado de la clase Cliente mirar si se dublican
        Si se repieden al imprimir es por que son dos objetos Direntes. Cl1 y Cl5
        */
        Cliente cl5= new Cliente("Miguel Castaño","0004",400000);
        
        /*COLLECTION TIPO SED
        Subtipo:
        HashSet 
        No permite duplicados
        No ordena
        No tiene acceso Aleatorio
        */
        Set<Cliente> clientesBanco = new HashSet<Cliente>();
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);
        /*podemos recorrer las collection con foreach y tambien Iterador*/
        /*for (Cliente cliente : clientesBanco) {
            //System.out.println("Nombre: "+cliente.getNombre()+" Numero de Cuenta: "+cliente.getN_cuenta()+" Saldo Cliente: "+cliente.getSaldo());
            //Eliminar un dato de la collection
            if(cliente.getNombre().equals("Abraham David")){
                clientesBanco.remove(cliente);
                // no se puede eliminar genera error:
        Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1445)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1469)
	at src.CuentasUsuarios.main(CuentasUsuarios.java:33)
C:\Users\Usuario\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
BUILD FAILED (total time: 0 seconds)
            }
            
        }*/
        Iterator<Cliente> it=clientesBanco.iterator();
        while (it.hasNext()) {
            String nombre_cliente=it.next().getNombre();
          //  System.out.println(nombre_cliente);
            if(nombre_cliente.equals("Abraham David")){
                it.remove();
            }
            
        }
        for (Cliente cliente : clientesBanco) {
            System.out.println("Nombre: "+cliente.getNombre()+" Numero de Cuenta: "+cliente.getN_cuenta()+" Saldo Cliente: "+cliente.getSaldo());

        }
        /*
        imprime:
        Nombre: Miguel Castaño Numero de Cuenta: 0004 Saldo Cliente: 400000.0
Nombre: Miguel David Numero de Cuenta: 0001 Saldo Cliente: 200000.0
Nombre: Yuliana del Carmen Numero de Cuenta: 0002 Saldo Cliente: 250000
        */
            
        
    }
    
}
