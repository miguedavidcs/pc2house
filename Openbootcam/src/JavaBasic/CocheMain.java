package JavaBasic;
//VIDEO1.16

public class CocheMain {

    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new Coche();
        // asiganamos valores al objeto 2 y el metodo acelerar de la clase coche
        Coche cocheObj2 = new Coche("Rojo", "Honda", "civic", 1430.36, 5.4, 7.8);
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        // cambiar valor del atributo pormedio del cocheobj2
        cocheObj2.peso = 1500.3;
        System.out.println(cocheObj2);
        //1.17 Herencia
        CocheElectrico cocheElectricoObj = new CocheElectrico();
        cocheElectricoObj.motorElectrico = "TWX TESLA";
        cocheElectricoObj.color = "Verde";
        cocheElectricoObj.fabricante = "Tesla";
        cocheElectricoObj.modelo = "S";
        cocheElectricoObj.peso = 100.0;
        cocheElectricoObj.tamaño(4.1, 5.0);

        System.out.println(cocheElectricoObj);
        CocheHibrido cocheHibridoObj = new CocheHibrido();
        cocheHibridoObj.motorHibrido ="Semi-Nissan";
        cocheHibridoObj.color = "Gris";
        cocheHibridoObj.fabricante = "Nissan";
        cocheHibridoObj.modelo = "Sx7";
        cocheHibridoObj.peso = 150.0;
        cocheHibridoObj.tamaño(4.7, 5.0);
        System.out.println(cocheHibridoObj);
        // Herencia con metodo super     
        CocheElectrico cocheElectricoObj2 = new CocheElectrico( "azul", "Audi", 
                                          "Audie", 100.0, 3.5, 4.5, "TEXAudie");
        System.out.println(cocheElectricoObj2);
        //1.19 Sobre escritura
        cocheElectricoObj2.acelerar(50);
        System.out.println(cocheElectricoObj2);
        
        
    }
       
   
}
