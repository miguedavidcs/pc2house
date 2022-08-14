package JavaBasic;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {

    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    // sobrecarga cuando duplicamos un metodo resiviendo parametros de la clase padre
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, Double ancho, String motorElectrico) {
       /* EVITAMOS ESCRIBIR TODO ESTO abajo y UTILIZAMOS EL METODO (super) 
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.motorElectrico = motorElectrico;*/
       super(color,fabricante,modelo,peso,largo,ancho);
       this.motorElectrico = motorElectrico;
        
    //video 1.19 de sobre escritura
    }
    @Override
    public void acelerar(Integer cantidad){
        Integer cantidadAjustada =cantidad*2;
        super.acelerar(cantidadAjustada);
    
    }

    @Override
    public String toString() {
        return "CocheElectrico{" + "color=" + color + ", "
                + "fabricante=" + fabricante
                + ", modelo=" + modelo
                + ", peso=" + peso
                + ", largo=" + largo
                + ", ancho=" + ancho
                + ", velocidad=" + velocidad
                + ", motorElectrico=" + motorElectrico
                + '}';
    }

}
