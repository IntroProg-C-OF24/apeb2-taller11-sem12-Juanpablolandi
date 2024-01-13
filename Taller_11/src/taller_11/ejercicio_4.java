package taller_11;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion;
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese su cédula");
        String cedula = teclado.nextLine();
        System.out.println("-----------------");
        System.out.println("Ingrese 1 si desea calcular el valor de la Planilla de luz");
        System.out.println("Ingrese 2 si desea calcular el costo de del inmueble");
        opcion = teclado.nextInt();
        System.out.println("-------------------------------------------------------");
        switch (opcion){
            case 1:
                planillaLuz(nombre, cedula);
                break;
            case 2:
                valorInmueble(nombre, cedula);
                break;
        }
    }
    public static void planillaLuz(String nombre, String cedula) {
        System.out.println("PLANILLA DE LUZ");
        Scanner teclado = new Scanner(System.in);     
        double costoKilovatio, consumoKilovatio,valorPlanilla;
        System.out.println("Ingrese el costo del kilovatio: ");
        costoKilovatio = teclado.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos al mes ");
        consumoKilovatio = teclado.nextDouble();
        valorPlanilla = (costoKilovatio * consumoKilovatio);
        System.out.println("==================");
        System.out.println("Cliente: ");
        System.out.println(nombre);
        System.out.println("Cédula: ");
        System.out.println(cedula);
        System.out.println("Usted debe cancelar: ");
        System.out.printf("%.2f ", valorPlanilla);
    }
    public static void valorInmueble(String nombre, String cedula) {
        System.out.println("VALOR INMUEBLE");
        Scanner teclado = new Scanner(System.in);     
        double valorInmueble, predio;
        System.out.println("Ingrese el costo del inmueble: ");
        valorInmueble = teclado.nextDouble();
        predio = (valorInmueble * 0.02);
        System.out.println("=============");
        System.out.println("Cliente: ");
        System.out.println(nombre);
        System.out.println("Cédula: ");
        System.out.println(cedula);
        System.out.print("El valor del predio es: $");
        System.out.printf("%.2f ", predio);
    }
}
/*POR JP MI PROFEEEEEEEE
BIENVENIDO
Ingrese su nombre
Juan Pablo Landi
Ingrese su cédula
1150006524
-----------------
Ingrese 1 si desea calcular el valor de la Planilla de luz
Ingrese 2 si desea calcular el costo de del inmueble
2
-------------------------------------------------------
VALOR INMUEBLE
Ingrese el costo del inmueble: 
7000
Cliente: 
Juan Pablo Landi
Cédula: 
1150006524
El valor del predio es: $140,00
*/