
package pkg5.operacioneslista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesLista {
//1,8,5,2,33,54,22,6,88,13
    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList();
        Lista.add(1);
        Lista.add(8);
        Lista.add(5);
        Lista.add(2);
        Lista.add(33);
        Lista.add(54);
        Lista.add(22);
        Lista.add(6);
        Lista.add(88);
        Lista.add(13);
        List<Integer> ListaFilt= Lista.stream()
                .filter(num->num%2==0)
                .collect(Collectors.toList());
        System.out.println(ListaFilt);
        
    }
    
}
