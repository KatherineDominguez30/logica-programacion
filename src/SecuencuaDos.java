/*Problema: Realizar la carga del lado de un cuadrado, mostrar por pantalla
el perimetro del mismo(el perimetro de un cuadradro se calcula multiplicando
el valor del lado por cuatro)*/
import java.util.Scanner;
public class SecuencuaDos {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el lado del cuadrado: ");
        int num= scanner.nextInt();

        int res = cuadrado(num);
        System.out.println("El valor de su perimetro es: " + res + "cm2");
    }

    public static int cuadrado(int num){
        return num * 4;
    }

}
