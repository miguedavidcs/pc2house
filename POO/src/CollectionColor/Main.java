package CollectionColor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[]args) {
        Color c1= new Color(5,"verde");
        Color c2= new Color(8,"rojo");
        Color c3= new Color(3,"amarillo");
        Color c4= new Color(5,"gris");
        Color c5= new Color(1,"blanco");
        Set<Color> coloresBanco = new HashSet<Color>();
        coloresBanco.add(c1);
        coloresBanco.add(c2);
        coloresBanco.add(c3);
        coloresBanco.add(c4);
        coloresBanco.add(c5);
        
        Iterator<Color> it=coloresBanco.iterator();
        while (it.hasNext()) {
            String nombre_color=it.next().getColor();
          //  System.out.println(nombre_cliente);
            if(!nombre_color.equals("rojo")){
                it.remove();
            }
            
        }
        for (Color color : coloresBanco) {
                            
                System.out.println("Numero: "+color.getNum()+" Nombre: "+color.getColor());
            }
                
           
    
    }
    
}
