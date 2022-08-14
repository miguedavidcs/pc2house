
package JavaBasic;
// que contine una clase 1.1video
public class Coche {
    // atributos
   String color;
   String fabricante;
   String modelo;
   Double peso;
   Double largo;
   Double ancho;
   Integer velocidad=0;
   // constructores
   public Coche(){
   }
   public Coche(String color,String fabricante,String modelo,Double peso,Double 
           largo,Double ancho){
   this.color= color;
   this.fabricante=fabricante;
   this.modelo= modelo;
   this.peso=peso;
   this.largo=largo;
   this.ancho=ancho;
       
   }
   // comportamiento
   public void acelerar(Integer cantidad){
       if(cantidad>0 && cantidad<=120){
         this.velocidad +=cantidad;  
       }
       
   }
   public void tamaño(Double largo,Double ancho){
   this.largo=largo;
    this.ancho=ancho;
    
   }

    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", fabricante=" + fabricante + 
                ", modelo=" + modelo + ", peso=" + peso + ", largo=" + largo + 
                ", ancho=" + ancho + ", velocidad=" + velocidad + '}';
    }
   
    
}
