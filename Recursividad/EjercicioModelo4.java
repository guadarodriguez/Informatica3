package Recursividad;

public class EjercicioModelo4 {
    public static void main(String[] args) {
        int [] array = {8,1,5,9,2,6,11,19,17};
        System.out.println(recursividad(array, array.length));
       
    }
    public static int recursividad (int [] v, int n){
        int num = 0;

        if(n==0){
            return 0;
        }else{
            return v[n-1] + recursividad(v, n-1);


        }
    }
}
