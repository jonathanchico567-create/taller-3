

import java.util.LinkedList;
import java.util.Queue;

public class Cola {

    private Queue<String> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    // insertar (enqueue)
    public void encolar(String dato) {
        cola.add(dato);
    }

    // eliminar (dequeue)
    public String desencolar() {
        if (cola.isEmpty()) return null;
        return cola.poll();
    }

    // ver el primero
    public String frente() {
        if (cola.isEmpty()) return null;
        return cola.peek();
    }

    // verificar si está vacía
    public boolean estaVacia() {
        return cola.isEmpty();
    }

    // tamaño
    public int tamanio() {
        return cola.size();
    }

    // mostrar
    public void mostrar() {
        System.out.println(cola);
    }
}
