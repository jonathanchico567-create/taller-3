

public class MainPila {
    public static void main(String[] args) {

        Pila pila = new Pila();

        pila.apilar("Libro 1");
        pila.apilar("Libro 2");
        pila.apilar("Libro 3");

        System.out.println("Pila:");
        pila.mostrar();

        System.out.println("\nCima:");
        System.out.println(pila.cima());

        System.out.println("\nDesapilar:");
        pila.desapilar();
        pila.mostrar();

        System.out.println("\nTamaño:");
        System.out.println(pila.tamanio());
    }
}
