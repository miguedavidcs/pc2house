
package src;

import java.util.Objects;

public class Cliente {
    public Cliente(String nombre,String n_cuenta,double saldo){
        this.nombre=nombre;
        this.n_cuenta=n_cuenta;
        this.saldo=saldo;
        
    }
    private String nombre;
    private String n_cuenta;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/* sobre cargamos el metodo hashCode():
    Nombre: Abraham David Numero de Cuenta: 0003 Saldo Cliente: 300000.0
    Nombre: Miguel Castaño Numero de Cuenta: 0004 Saldo Cliente: 400000.0
    Nombre: Miguel David Numero de Cuenta: 0001 Saldo Cliente: 200000.0
    Nombre: Yuliana del Carmen Numero de Cuenta: 0002 Saldo Cliente: 250000.0
    No se repite el cliente 1 y 5 tienen el mismo numero de cuenta
    */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.n_cuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_cuenta, other.n_cuenta)) {
            return false;
        }
        return true;
    }
    
}
