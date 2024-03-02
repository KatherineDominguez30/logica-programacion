/* Problema: Se ingresa por teclado un valor entero, moostrar una leyenda que indique si el numero
* es positivo, negativo o nulo(es decir cero)*/
import java.util.Scanner;
public class CondicionAnidada3 {
    public static void main(String[] args){
        funcionCondicionAnidada2();
    }

    public static void funcionCondicionAnidada2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int num1 = scanner.nextInt();

        if (num1 > 0){
            System.out.print("El numero es positivo");
        }  else if (num1 == 0) {
            System.out.print("El numero es nulo");
        } else {
            System.out.print("El numero es negativo");
        }

        scanner.close();
    }
}
