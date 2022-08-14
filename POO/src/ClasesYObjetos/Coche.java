
package ClasesYObjetos;

public class Coche {
    //atributos
    String marca;
    String color;
    int km;
    //metodo
    public static void main(String []args){
        //objeto
        Coche coche1= new Coche();
        Coche coche2= new Coche();
        
        coche1.color="Blanco";
        coche1.marca="Audi";
        coche1.km=0;
        
        coche2.color="Gris";
        coche2.marca="Kia";
        coche2.km=50;
        
        System.out.println("\nEl color de mi  coche "+coche1.color);
        System.out.println("La marca de mi coche es "+coche1.marca);
        System.out.println("Cuanto kilometraje tiene mi carro "+coche1.km);
        
        System.out.println("El color de mi segundo coche "+coche2.color);
        System.out.println("La marca de mi segundo coche es "+coche2.marca);
        System.out.println("Cuanto kilometraje tiene mi segundo carro "+coche2.km);
        
    }
    
}
