package taller_11;
public class ejercicio_5 {
    public static void main(String[] args) {
        int limF=3, limC=3;
        int matriz1 [][]= new int [limF][limC];
        int matriz2 [][]= new int [limF][limC];
        int matriz3 [][]= new int [limF][limC];
        generarMatriz(matriz1, limF, limC);   
        generarMatriz(matriz2, limF, limC);
        System.out.println("La matriz 1 generada es: \n" + devolverMatriz(matriz1, limF, limC));
        System.out.println("La matriz 2 generada es: \n" + devolverMatriz(matriz2, limF, limC));
        sumarMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("La suma de las matrices es: \n" + devolverMatriz(matriz3, limF, limC));
        restarMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("La resta de las matrices es: \n" + devolverMatriz(matriz3, limF, limC));
        multiplicarMatrices(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("La multiplicación de las matrices es: \n" + devolverMatriz(matriz3, limF, limC));
    } 
    public static void generarMatriz (int matriz [][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);  
            }     
        }
    }   
    public static String devolverMatriz (int matriz [][], int limF, int limC){
        String cadena="";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t" , matriz[i][j]);
            }
            cadena += "\n";
        }
        return cadena;
    } 
    public static void sumarMatrices (int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }     
        }
    }  
    public static void restarMatrices (int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
            }     
        }
    }
    public static void multiplicarMatrices(int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                for (int k = 0; k < limF; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }
}
/*POR JP MI PROFEEEEEE
La matriz 1 generada es: 
8	7	6	
4	8	7	
4	6	2	

La matriz 2 generada es: 
9	8	6	
3	9	5	
2	9	4	

La suma de las matrices es: 
17	15	12	
7	17	12	
6	15	6	

La resta de las matrices es: 
-1	-1	0	
1	-1	2	
2	-3	-2	

La multiplicación de las matrices es: 
104	180	107	
75	166	94	
60	101	60	
*/