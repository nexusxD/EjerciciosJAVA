package pkg7.numerorandom;

import java.util.Scanner;

public class NumeroRandom {

    public static void main(String[] args) {
        double ran=Math.round(100*Math.random());
        int  intentos=0;
        boolean ban=false;
        System.out.println(ran);
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el número que piensas del 1 al 100: ");
        double Respuesta = leer.nextInt();
        do{            
            if(Respuesta==ran){
                System.out.println("Felicidades, adivinaste el número :D");
                ban=true;
                break;
            }else{
                if(Respuesta<ran){
                    intentos++;
                    System.out.print("El número que ingresaste es menor :C Intenta de nuevo: ");
                    Respuesta = leer.nextInt();
                }else {
                    if (Respuesta>ran){
                        intentos++;
                        System.out.print("El número que ingresaste es mayor :C Intenta de nuevo: ");
                        Respuesta = leer.nextInt();
                    }
                }
            }
            
        }while(intentos<4);
        if(ban==true){
                
            }else{
                System.err.println("Perdiste tu oportunidad, el número correcto era: "+ran);
            }
        
    }
    
}
