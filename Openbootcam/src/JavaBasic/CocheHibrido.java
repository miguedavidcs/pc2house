package JavaBasic;

public class CocheHibrido extends Coche{
    String motorHibrido;

    public CocheHibrido() {
    }
    public CocheHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }
    @Override
    public String toString() {
        return "CocheHibrido{" + "color=" + color + ", "
                + "fabricante=" + fabricante
                + ", modelo=" + modelo
                + ", peso=" + peso
                + ", largo=" + largo
                + ", ancho=" + ancho
                + ", velocidad=" + velocidad
                + ", motorElectrico=" + motorHibrido
                + '}';
    }

    
    
}
