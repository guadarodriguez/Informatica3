package ListasEnlazadas;

import java.util.LinkedList;

public class EjercicioRepaso {
public static void main(String[] args) {
    LinkedList<Integer> lista = new LinkedList<>();
    lista.add(1);
    lista.add(2);
    lista.add(3);

    lista.remove();

    for (Integer integer : lista) {
        System.out.println(integer);
    }
}
}
