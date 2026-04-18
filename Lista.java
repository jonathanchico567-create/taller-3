import java.util.ArrayList;
import java.util.Collections;

public class Lista {

    private ArrayList<String> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    // insertar al inicio
    public void insertarAlInicio(String dato) {
        lista.add(0, dato);
    }

    // insertar al final
    public void insertarAlFinal(String dato) {
        lista.add(dato);
    }

    // eliminar al inicio
    public String eliminarAlInicio() {
        if (lista.isEmpty()) return null;
        return lista.remove(0);
    }

    // buscar
    public boolean buscar(String dato) {
        return lista.contains(dato);
    }

    // tamaño
    public int tamanio() {
        return lista.size();
    }

    // obtener por índice
    public String obtenerPorIndice(int i) {
        if (i < 0 || i >= lista.size()) return null;
        return lista.get(i);
    }

    // eliminar por valor
    public void eliminarPorValor(String dato) {
        lista.remove(dato);
    }

    // invertir lista
    public void invertir() {
        Collections.reverse(lista);
    }

    // mostrar
    public void mostrar() {
        System.out.println(lista);
    }
}