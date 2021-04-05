package Practico_8_GitHubSourceTree;

import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String [] Args){
            //Escribir un método que reciba un número y retorne su doble
            Scanner input= new Scanner(System.in);
            System.out.println("Ingrese un número");
            int num= input.nextInt();
            int elDoble=calcularDoble(num);
            System.out.println("el doble de " +num+ " es " +elDoble);

        }
        public static int calcularDoble(int num){
            return(num*2);
        }
    }
    
