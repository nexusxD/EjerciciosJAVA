
package pkg8.condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el número A: ");
        int numA = leer.nextInt();
        System.out.print("Ingresa el número B: ");
        int numB = leer.nextInt();
        System.out.print("Ingresa el número C: ");
        int numC = leer.nextInt();
        if(numA>numB){
            if(numA>numC){
                if(numB>numC){
                    System.out.println(numA);
                    System.out.println(numB);
                    System.out.println(numC);
                }else{
                    System.out.println(numA);
                    System.out.println(numC);
                    System.out.println(numB);
                }
            }else{
                System.out.println(numC);
                System.out.println(numA);
                System.out.println(numB);
            }
        }else{
            if(numA>numC){
                System.out.println(numB);
                System.out.println(numA);
                System.out.println(numC);
            }
            if(numC>numB){
                System.out.println(numC);
                System.out.println(numB);
                System.out.println(numA);
            }else{
                System.out.println(numB);
                System.out.println(numC);
                System.out.println(numA);
            }
            
        }
    }
    
}
