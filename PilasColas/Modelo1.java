package PilasColas;

import java.util.LinkedList;
import java.util.Stack;

/*Hacer un método que reciba una lista y una pila, el método deberá
modificar la lista original, eliminando las posiciones indicadas por cada nodo
de la pila. */
public class Modelo1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();

        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(9);
        lista.add(3);

        pila.push(2);
        pila.push(5);

        LinkedList<Integer> nuevaLista = new LinkedList<>();
        // int tamanio = lista.size();
        int index = 0;

        while (!pila.isEmpty()) {
            Integer temp = pila.pop();

            for (int i = 0; i < temp; i++) {
                if (index < lista.size()) {
                    nuevaLista.add(lista.get(index));
                    index++;
                }
            }
        }
        while (index < lista.size()) {
            nuevaLista.add(lista.get(index));
            index++;
        }

        for (Integer elemento : nuevaLista) {
            System.out.print(elemento + " ");
        }

    }

}
