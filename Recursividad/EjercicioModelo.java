package Recursividad;

public class EjercicioModelo {
    public static void main(String[] args) {
        String [] arregloVocales ={"H","o","l","a","H","o","l","a"};
        System.out.println(Vocales(arregloVocales, 0, 0));
        
    }
    public static int Vocales (String [] v, int n, int total ){
        if (n ==v.length) {
            return total;
        }
        String actual = v[n];
        if(actual.toLowerCase()=="a" ||actual.toLowerCase()=="e" || actual.toLowerCase()=="i"
        ||actual.toLowerCase()=="o"||actual.toLowerCase()=="u"){
            total ++;
            return Vocales(v, n+1, total);
        }else{
            return Vocales(v, n+1, total);
        }

        /*for (int i=0; i<v.length;i++){
            if(v[i].toLowerCase()=="a" || v[i].toLowerCase()=="e" || v[i].toLowerCase()=="i"
            || v[i].toLowerCase()=="o"||v[i].toLowerCase()=="u"){
                cantVocales = cantVocales + 1;
            }            
        }*/
    }
}
