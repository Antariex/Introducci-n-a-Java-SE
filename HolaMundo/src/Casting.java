public class Casting {
    public static void main(String[] args) {

        // En un año se ubicaron 30 mascotas, ¿cuántas se ubicaron por mes?
        double mascotasMensuales = 30.0 / 12.0;
        System.out.println(mascotasMensuales);

        // Estimacion
        int estimadoMensual = (int) mascotasMensuales;
        System.out.println(estimadoMensual);

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a / b);
    }
}
