/*Problema: realizar un programa que pida cargar una fecha,
 luego verificar si dicha fecha corresponde a Navidad*/

import java.util.Scanner;

public class IntroducirFecha {
    public static void main(String[] args){
        introduceFecha();
    }

    public static void introduceFecha(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();


        if ( dia == 25 && mes == 12 ) {
            System.out.println( "Es navidad!!");
                 } else if ( dia != 25 && mes != 12 ) {
            System.out.println("No es navidad");
        }
        System.out.println( " Hos es: " + dia + " del mes " + mes + " del ano " + ano);
        scanner.close();

    }
}
