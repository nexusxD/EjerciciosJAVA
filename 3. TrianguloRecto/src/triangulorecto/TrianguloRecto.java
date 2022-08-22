package triangulorecto;

import java.util.Scanner;

public class TrianguloRecto {

    public static void main(String[] args) {
        int num=1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la altitud del triangulo: ");
        int altura = leer.nextInt();
        for(int i=1;i<=altura;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print("\n");
        }
    }
    
}
