
package pkg6.operacioneslista2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesLista2 {

    public static void main(String[] args) {
        //Rusia, Estados Unidos, Brasil, Canada, México
     List<String> Lista = new ArrayList();
     List<String> NueLista = new ArrayList();
     Lista.add("Rusia");
     Lista.add("Estados Unidos"); 
     Lista.add("Brasil");
     Lista.add("Canada");
     Lista.add("México");
     List<String> ListaFilt= Lista.stream()
             .filter(pal->pal.endsWith("a")||pal.endsWith("e")||pal.endsWith("i")||pal.endsWith("o")||pal.endsWith("u")||pal.endsWith("A")||pal.endsWith("E")||pal.endsWith("I")||pal.endsWith("O")||pal.endsWith("U"))
             .collect(Collectors.toList());
    for(int i=0;i<ListaFilt.size();i++){
           String ayuda = (String) (ListaFilt.get(i)) ;
           ayuda=ayuda.toUpperCase();
           NueLista.add(ayuda);
           
       }
    
    System.out.println(NueLista);
     
    }
    
}
