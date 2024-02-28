import java.util.Scanner;


public class SecuenciaUno {

    public static void main(String[] args){
       int num1, num2 , res, pro;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa valor 1: ");
        num1= scanner.nextInt();
        System.out.print("Ingresa valor 2: ");
        num2= scanner.nextInt();

        res = SumaEnSecuencia(num1,num2);
        System.out.println("La suma es: " +res);
        pro = ProductoEnSecuencia(num1,num2);
        System.out.println("\n El producto es: " +pro);
        scanner.close();
    }

    public static int SumaEnSecuencia(int num1, int num2){
    return num1 + num2;
    }
    public static int ProductoEnSecuencia(int num1, int num2){
        return num1 * num2;
    }










}
