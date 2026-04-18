public class GestorCalificaciones {

    private double[] calificaciones;
    private int totalEstudiantes;

    public GestorCalificaciones(int capacidad) {
        calificaciones = new double[capacidad];
        totalEstudiantes = 0;
    }

    public void agregar(double nota) {
        calificaciones[totalEstudiantes++] = nota;
    }

    public void ordenarBurbuja() {
        for (int i = 0; i < totalEstudiantes - 1; i++) {
            for (int j = 0; j < totalEstudiantes - i - 1; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    double temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = temp;
                }
            }
        }
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < totalEstudiantes; i++)
            suma += calificaciones[i];
        return suma / totalEstudiantes;
    }

    public double mayor() {
        double max = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] > max) max = calificaciones[i];
        return max;
    }

    public double menor() {
        double min = calificaciones[0];
        for (int i = 1; i < totalEstudiantes; i++)
            if (calificaciones[i] < min) min = calificaciones[i];
        return min;
    }

    public int contarAprobados(double min) {
        int c = 0;
        for (int i = 0; i < totalEstudiantes; i++)
            if (calificaciones[i] >= min) c++;
        return c;
    }
}
