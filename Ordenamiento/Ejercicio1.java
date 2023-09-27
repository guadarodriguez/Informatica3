package Ordenamiento;

import java.util.Random;

/*1. Implemente los métodos de ordenación de inserción, Shellsort y quicksort usando
las implementaciones del teórico. Ejecútelos con los siguientes objetos:
a. enteros.
b. números reales de tipo double.
c. cadena de caracteres. */
public class Ejercicio1 {
    public static void main(String[] args) {
        /*CARGA DE ARREGLOS RANDOM */
    
        int arraySize = 6; 
        int[] listaEnteros = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
        listaEnteros[i] = random.nextInt(1000); 
        }
 
        Double[] listaReales = new Double[arraySize];
        for (int i = 0; i < arraySize; i++) {
        listaReales[i] =  random.nextDouble(); 
        }

        char[] listaCaracteres = new char[arraySize];

        for (int i = 0; i < arraySize; i++) {
        listaCaracteres[i] = (char) (random.nextInt(26) + 'a');
        }

        /*MUESTRA EN PANTALLA DE ARREGLOS DESORDENADOS */

        System.out.println("---ARREGLOS DESORDENADOS---");
        for(int entero: listaEnteros){
            System.out.println("entero: " + " " + entero);
        }
        for(char caracter: listaCaracteres){
            System.out.println("caracter: " + " " + caracter);
        }
        for(Double real: listaReales){
            System.out.println("Real: " + " " + real);
        }

        /*ORDENAMIENTOS */

        System.out.println("---ARREGLOS ORDENADOS CON SHELL---");
        shellSort(listaEnteros, arraySize);
        for(int entero: listaEnteros){
            System.out.println("entero: " + " " + entero);
        }
        shellSortDouble(listaReales, arraySize);
        for(Double real: listaReales){
            System.out.println("Real: " + " " + real);
        }

        System.out.println("---ARREGLOS ORDENADOS CON INSERCION---");
        insertionSort(listaEnteros);
        for(int entero: listaEnteros){
            System.out.println("entero: " + " " + entero);
        }
        insertionSortDouble(listaReales);
        for(Double real: listaReales){
            System.out.println("Real: " + " " + real);
        }        
        System.out.println("---ARREGLOS ORDENADOS CON QUICKSORT---");
        quicksort(listaEnteros, arraySize, arraySize);
        for(int entero: listaEnteros){
            System.out.println("entero: " + " " + entero);
        }        
        quicksortDouble(listaReales, arraySize, arraySize);
        for(Double real: listaReales){
            System.out.println("Real: " + " " + real);
        }        
    }

    /*METODOS DE ORDENAMIENTO */

    public static void shellSort(int[] v, int n) {
        int gap, i, j, temp;
        for (gap=n/2; gap > 0; gap /= 2)
           for ( i = gap; i < n; i++)
              for ( j=i-gap; j>=0 && v [j] > v [j+gap]; j-=gap) {
                 temp = v[j];
                 v [j] = v [j+gap];
                 v [j+gap] = temp;
              }
        }
    public static void shellSortDouble(Double[] v, int n) {
        int gap, i, j;
        Double temp;
        for (gap=n/2; gap > 0; gap /= 2)
           for ( i = gap; i < n; i++)
              for ( j=i-gap; j>=0 && v [j] > v [j+gap]; j-=gap) {
                 temp = v[j];
                 v [j] = v [j+gap];
                 v [j+gap] = temp;
              }
        }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            }
        }
    public static void insertionSortDouble(Double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            }
        }
        public static void quicksort (int [ ] item, int left, int right)
        {
           int i, j, temp;
           i = left;
           j = right;
           do {
              while ( item [j] > item [i] && j>i) j-- ;
              if ( i<j ) {
                 temp=item[i];
                 item[i] = item[j];
                 item[j] = temp;
                 i++;
             }
              while ( item [i] < item [j] && i<j ) i++ ;
              if ( i<j ) {
                 temp=item[i];
                 item[i] = item[j];
                 item[j] = temp;
                 j--;
             }
           } while ( i<j );
           if ( left < j ) quicksort (item, left, j-1 );
           if ( i < right ) quicksort ( item, i+1, right );
        }        
        public static void quicksortDouble (Double [ ] item, int left, int right)
        {
           int i, j; 
           Double temp;
           i = left;
           j = right;
           do {
              while ( item [j] > item [i] && j>i) j-- ;
              if ( i<j ) {
                 temp=item[i];
                 item[i] = item[j];
                 item[j] = temp;
                 i++;
             }
              while ( item [i] < item [j] && i<j ) i++ ;
              if ( i<j ) {
                 temp=item[i];
                 item[i] = item[j];
                 item[j] = temp;
                 j--;
             }
           } while ( i<j );
           if ( left < j ) quicksortDouble (item, left, j-1 );
           if ( i < right ) quicksortDouble ( item, i+1, right );
        }   
    }
    


