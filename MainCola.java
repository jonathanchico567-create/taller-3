

public class MainCola {
    public static void main(String[] args) {

        Cola cola = new Cola();

        cola.encolar("Cliente 1");
        cola.encolar("Cliente 2");
        cola.encolar("Cliente 3");

        System.out.println("Cola:");
        cola.mostrar();

        System.out.println("\nAtender cliente:");
        cola.desencolar();
        cola.mostrar();

        System.out.println("\nFrente:");
        System.out.println(cola.frente());

        System.out.println("\nTamaño:");
        System.out.println(cola.tamanio());
    }
}