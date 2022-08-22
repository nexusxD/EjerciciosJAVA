package pkg2.crearlistastring;

import java.util.*;


public class CrearListaString {

    public static void main(String[] args) {
        List Arreglo = new ArrayList();
        Arreglo.add("juan");
        Arreglo.add("pedro");
        Arreglo.add("jose");
        Arreglo.add("maria");
        Arreglo.add("sofia");
                        
        for(int i=0;i<Arreglo.size();i++){
           String ayuda = (String) (Arreglo.get(i)) ;
           String primera  = ayuda.substring(0, 1);
           String resto = ayuda.substring(1,ayuda.length());
           primera = primera.toUpperCase();
           ayuda=primera+resto;
           System.out.println(ayuda);
       }
        
    }
    
}
