/**
 * Nombres: Ricardo Sevilla, Nayeli Parra , Kevin Gomez
 * Grado: 3 INF A
 * Tema: Proyecto MB
 */
package javaapplication1;
import java.util.Scanner;

public class MB{


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opcion,re;
        int[ ] numero = new int [5];
        do{
            System.out.println("Ingrese la opcion que quiera escoger");
            System.out.println("1.Cases listos");
            System.out.println("2.Ratones");
            System.out.println("3.Monitores");
            System.out.println("4.Teclados");
            System.out.println("5.Parlantes");
            System.out.println("6.Memorias USB");
            System.out.println("7.Inventario");
            System.out.println("8.Salir");
            opcion=teclado.nextInt(); 
            switch(opcion){
                case 1:
                    System.out.println("Inserte la cantidad de cases");
                    numero[0]=teclado.nextInt(); 
                    break;
                case 2:
                    System.out.println("Inserte la cantidad de ratones");
                    numero[1]=teclado.nextInt(); 
                    break;
                case 3:
                    System.out.println("Inserte la cantidad de monitores");
                    numero[2]=teclado.nextInt(); 
                    break;    
                case 4:
                    System.out.println("Inserte la cantidad de teclados");
                    numero[3]=teclado.nextInt(); 
                    break;
                case 5:
                    System.out.println("Inserte la cantidad de parlantes");
                    numero[4]=teclado.nextInt(); 
                    break;
                case 6:
                    System.out.println("Inserte la cantidad de memorias USB");
                    numero[5]=teclado.nextInt(); 
                    break;
                case 7:
                    System.out.println("Inventario");
                    break;
                case 8:
                    break;
            }//fin switch
            System.out.println("Marque 1 si desea continuar");
            System.out.println("Marque 2 si desea salir");
            re = teclado.nextInt();
        }while(re==1);
    }//fin main
    
}//fin class
