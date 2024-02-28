/*Problema: se debe desarrolar un programa que pida el ingreso del precio
de un articulo y la cantidad que lleva el cliente.
* Mostrar lo que debe abonar el comprador.
* Definir una variable float para el precio del articulo*/
import java.util.Scanner;
public class SecuenciaCinco {
    public static void main(String[] args) {
        producto();
    }

    public static void producto(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del articulo: ");
        String nombreArticulo = scanner.next();
        System.out.print("Ingresa el precio: ");
        float precio = scanner.nextFloat();
        System.out.print("Ingresa la cantidad: ");
        int cantidad = scanner.nextInt();

        float importe = precio * cantidad;
         System.out.println("Usted solicito el articulo: " + nombreArticulo + ", con un precio " + precio + ", cantidad " + cantidad
        + " articulos"+" \nPara importe de: " + importe );
        System.out.print("Ingresa la cantidad a abonar: ");

        float abono = scanner.nextFloat();
        float resta = importe - abono;
        System.out.println("\nCon un abono de: " + abono + ", usted deberia " + resta + "$");


        scanner.close();
    }

}
