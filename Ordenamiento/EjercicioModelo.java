package Ordenamiento;

public class EjercicioModelo {
    public static void main(String[] args) {
        int [] array = {8,1,5,9,2,6,11,19,17};
        shellSort(array,9 );
        for (int i : array) {
            System.out.println(array[i]);
        }


    }
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
}
