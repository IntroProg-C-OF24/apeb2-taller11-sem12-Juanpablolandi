package taller_11;
import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double nota1, nota2, nota3, nota4;
        System.out.println("Ingrese las 4 notas que desea promediar: ");
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();
        double promedio = promedioC(nota1,nota2,nota3,nota4);
        System.out.println("Promedio: ");
        System.out.printf("%.2f ", promedio);
        if (promedio <= 5){
            System.out.println("El promedio es regular");
        } else
            if(promedio >= 5.1 && promedio <= 8){
                System.out.println("El primedio es bueno");
            } else
                if (promedio >= 8.1 && promedio <= 9){
                    System.out.println("El promedio es muy bueno");
                } else 
                    if(promedio >= 9.1 && promedio <= 10){
                        System.out.println("El promedio es Sobresaliente");
                    }
    }
    public static double promedioC(double a,double b,double c,double d) {
        double promedio = ((a + b + c + d)/4);
        return promedio;
    }
}