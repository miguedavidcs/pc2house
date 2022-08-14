
package ObjyClass;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[]args){
        int n1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero: "));
        int n2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        Operacion op= new Operacion();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.producto(n1,n2);
        op.division(n1,n2);
        op.mostrarResultados();
    }
    
}
