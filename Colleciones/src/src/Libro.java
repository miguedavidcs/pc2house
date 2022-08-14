package src;

public class Libro {

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;

    }

    public String getDatos() {
        return "El titulo es: " + titulo + " El autor: " + autor + " Y el ISBN:  " + ISBN;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.ISBN;
        return hash;
    }

    /*
    gernerado por netbeans add con click derecho
    Es el mismo libro
        648
        648
     */
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
        final Libro other = (Libro) obj;
        if (this.ISBN != other.ISBN) {
            return false;
        }
        return true;
    }
    /*
    Sobre cargamos el codigo para que haga lo que yo quiero
     */
 /*@Override
    public boolean equals(Object obj) {
        
        linea 19-40
        instanceof nos permite verificar si el objeto es instancia de Libro
        para que obj pueda acceder al campo ISBN(DATOS)
        ISBN->PERTENECE A LA CLASE LIBRO
        ISBN-> NO PERTENECE A OJB
        hacemos casting y convertir el objeto-> obj que es de tipo Object en un Objeto de tipo Libro.
        al imprimir ahora nos sale:
        System.out.println("es el mismo libro");
         ----- inicia el codigo interno de la deficion de arriba
        if (obj instanceof Libro) {
            Libro otro=(Libro)obj;
            if(this.ISBN==otro.ISBN){
                return true;
            }else{
                return false;
            }
        }else
            return false;
    }
     */
    private String titulo;
    private String autor;
    private int ISBN;
}
