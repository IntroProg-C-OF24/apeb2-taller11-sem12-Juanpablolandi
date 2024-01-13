package taller_11;
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("INGRESE LAS OPCIONES QUE SE INDIQUEN");
        System.out.println("-----------------------");
        Scanner teclado = new Scanner (System.in);
        System.out.println("1) Area de un Cuadrado");
        System.out.println("2) Area de un Triángulo");
        System.out.println("3) Area de un Rectángulo");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                areaCuadrado();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areaRectangulo();
                break;
        }
    }
    public static void areaCuadrado() {
        System.out.println("AREA DE CUADRADO");
        Scanner teclado = new Scanner (System.in);
        double lado1, area, exponente = 4;
        System.out.println("Ingrese un lado del cuadrado");
        lado1 = teclado.nextInt();
        area = Math.pow(lado1, exponente);
        System.out.println("El Area del Cuadrado es: " + area);
    }
    public static void areaTriangulo() {
        System.out.println("AREA DEL TRIÁNGULO");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la base y luego la altura del triángulo: ");
        int base = teclado.nextInt();
        int altura = teclado.nextInt();
        double area = ((base * altura)/2);
        System.out.println("El área del triángulo es: " + area);
    }
    public static void areaRectangulo() {
        System.out.println("AREA DEL RECTÁNGULO");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese la base y luego la altura del rectángulo: ");
        int base = teclado.nextInt();
        int altura = teclado.nextInt();
        int area = (base * altura);
        System.out.println("El area del rectángulo es : " + area);
    }
}