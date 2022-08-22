
package pkg9.operacionlista3;

import java.util.ArrayList;
import java.util.List;

public class OperacionLista3 {

    public static void main(String[] args) {
         //Lista A (1,2,4,6,8,0,3,44,52,43,129)
       //Lista B (23,4,6,2,34,7,99,52,5,8)

     List<Integer> Lista = new ArrayList();
     List<Integer> Lista2 = new ArrayList();
     List<Integer> Lista3 = new ArrayList();
     Lista.add(1);
     Lista.add(2);
     Lista.add(4);
     Lista.add(6);
     Lista.add(8);
     Lista.add(0);
     Lista.add(3);
     Lista.add(44);
     Lista.add(52);
     Lista.add(43);
     Lista.add(129);
     Lista2.add(23);
     Lista2.add(4);
     Lista2.add(6);
     Lista2.add(2);
     Lista2.add(34);
     Lista2.add(7);
     Lista2.add(99);
     Lista2.add(52);
     Lista2.add(5);
     Lista2.add(8);
     
     for(int i=0;i<Lista.size();i++){
         for(int j=0;j<Lista2.size();j++){
             if(Lista.get(i).equals(Lista2.get(j))){
                 Lista3.add(Lista.get(i));             
            }
         }
     }
        System.out.println(Lista3);
     
    }
    
}
