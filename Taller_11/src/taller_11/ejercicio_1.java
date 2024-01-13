package taller_11;
public class ejercicio_1 {
    public static void main(String[] args) {
        int elementos = 3;
        int matriz[][] = new int[elementos][elementos];
        generarMatriz(matriz);
        elementosPares(matriz);
        elementosImpares(matriz);
    }
    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        System.out.println("MATRIZ: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static void elementosPares(int matriz[][]) {
        System.out.println("Elementos pares de la Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
    public static void elementosImpares(int matriz[][]) {
        System.out.println("Elementos Impares de la Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
/* POR JP MI PROFEEEEEEEE
MATRIZ: 
5	2	7	
4	5	1	
7	6	7	
Elementos pares de la Matriz: 
2	
4	
6	
Elementos Impares de la Matriz: 
5	7	
5	1	
7	7	
*/