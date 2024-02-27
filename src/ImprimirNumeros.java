/*Problema: Se ingresa tres numeros por teclado,
si todos son menores a 10, imprime en pantalla la leyenda
"Todos los numeros son menores a diez".*/
import java.util.Scanner;
public class ImprimirNumeros {

    public static void imprimeValores(int num1, int num2, int num3){

        if (num1 < 10 && num2 <10 && num3 <10){
            System.out.println("Todos los numeros son menores de 10");
        } else {
            System.out.println("Numeros superior a 10");
        }
    }


    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa valor 1: ");
        num1=scanner.nextInt();
        System.out.print("Ingresa valor 2: ");
        num2=scanner.nextInt();
        System.out.print("Ingresa valor 3: ");
        num3=scanner.nextInt();

        imprimeValores(num1,num2,num3);
        scanner.close();
        }

}
