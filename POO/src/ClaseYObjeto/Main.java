package ClaseYObjeto;

public class Main {
    public static void main(String[]args){
        //objeto de clase operaciones
        Operacion op = new Operacion();
        op.leerNumeros();
        op.suma();
        op.resta();
        op.division();
        op.mostrarResultados();
    }
    
}
