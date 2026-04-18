public class MainLista {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.insertarAlFinal("Canción 1");
        lista.insertarAlFinal("Canción 2");
        lista.insertarAlFinal("Canción 3");
        lista.insertarAlFinal("Canción 4");
        lista.insertarAlFinal("Canción 5");

        System.out.println("Lista inicial:");
        lista.mostrar();

        System.out.println("\nEliminar al inicio:");
        lista.eliminarAlInicio();
        lista.mostrar();

        System.out.println("\nBuscar Canción 3:");
        System.out.println(lista.buscar("Canción 3"));

        System.out.println("\nElemento índice 1:");
        System.out.println(lista.obtenerPorIndice(1));

        System.out.println("\nInvertir lista:");
        lista.invertir();
        lista.mostrar();
    }
}