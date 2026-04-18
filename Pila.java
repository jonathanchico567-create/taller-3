
import java.util.Stack;

public class Pila {

    private Stack<String> pila;

    public Pila() {
        pila = new Stack<>();
    }

    // insertar (push)
    public void apilar(String dato) {
        pila.push(dato);
    }

    // eliminar (pop)
    public String desapilar() {
        if (pila.isEmpty()) return null;
        return pila.pop();
    }

    // ver el tope
    public String cima() {
        if (pila.isEmpty()) return null;
        return pila.peek();
    }

    // verificar si está vacía
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    // tamaño
    public int tamanio() {
        return pila.size();
    }

    // mostrar
    public void mostrar() {
        System.out.println(pila);
    }
}
