/*https://phantom-comet-08a.notion.site/Lista-de-problemas-para-principiantes-en-la-programaci-n-4ab904d49a9f4edd92e3c79711f18bb8
2. Calcular el área de un triángulo:*/

import java.util.Scanner;

public class AreaDeUnTriangulo {

    public static int calcularArea(int base, int altura){
        return (base * altura) / 2;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int base;
        int altura;

        System.out.print("Introduce la base:");
        base = scanner.nextInt();
        System.out.print("Introduce la altura:");
        altura = scanner.nextInt();

        int area = calcularArea(base, altura);
        int multi = base * altura;
        System.out.println("\nSi multipicamos la base " + base+ "cm2" +" *" + " la altura " + altura + "cm2" +
                ", el resultado es: " +multi +"cm2 \n" + "Luego de la multiplicacion de la base y altura" +
                " lo dividimos por 2 y obteniendo como resultado del area " + area + "cm2 \n\n " +
                "                    " + base+ "*" + altura + "="+ multi + "/2" +  "= " +area + "cm2");
    }
}

