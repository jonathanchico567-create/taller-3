import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {

        GestorCalificaciones g = new GestorCalificaciones(10);

        double[] notas = {3.5, 4.0, 2.8, 5.0, 3.0, 1.5, 4.2, 3.8, 2.9, 4.7};

        // usar Arrays
        System.out.println("Notas originales: " + Arrays.toString(notas));

        for (double n : notas) {
            g.agregar(n);
        }

        g.ordenarBurbuja();

        System.out.println("Promedio: " + g.promedio());
        System.out.println("Mayor: " + g.mayor());
        System.out.println("Menor: " + g.menor());
        System.out.println("Aprobados: " + g.contarAprobados(3.0));
    }
}