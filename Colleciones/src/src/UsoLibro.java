
package src;


public class UsoLibro {
     public static void main(String[]args){
         Libro libro1 =new Libro("P en Java","Juan",25);
         Libro libro2 =new Libro("P en Java","Juan",25);
         
         /*
         igualamos libros para el hashCode()
         para que la referencia sea la misma:
           366712642
           366712642
         */
         //libro1=libro2;
         /*
         Equal probar esta sub collection tipo set
         comparando objetos diferentes pero con la misma informacion.
         esta imprime 
         System.out.println("No es el mismo Libro");
         como mejorar el equal  creamos un metodo en la clase Libro.java
         */
         /*
         hashCode aprendamos a ver que pasa y nos muestra que nos dice donde 
         se diferencia:
         366712642
         1829164700
         */
         if (libro1.equals(libro2)){
             System.out.println("Es el mismo libro");
             System.out.println(libro1.hashCode());
             System.out.println(libro2.hashCode());
         }else{
             System.out.println("No es el mismo Libro");
             System.out.println(libro1.hashCode());
             System.out.println(libro2.hashCode());
         }
         
     }
    
}
