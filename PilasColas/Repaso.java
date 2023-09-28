package PilasColas;
import java.util.LinkedList;
import java.util.Stack;

public class Repaso {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        historial.push(a());
        historial.push(a());
        historial.push(a());
        historial.push(a());
        deshacer(historial);

    }



    
    public static String a() {
        System.out.println("Método a realizado.");
        return " proceso a ";
    }

    public void b() {
        System.out.println("Método b realizado.");
    }

    public void c() {
        System.out.println("Método c realizado.");
    }

    public void d() {
        System.out.println("Método d realizado.");
    }
    public static void deshacer(Stack<String> historial) {
        if (!historial.isEmpty()) {
            String ultimaOperacion = historial.pop();
            System.out.println("Se deshizo el último método: " + ultimaOperacion);
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }}

