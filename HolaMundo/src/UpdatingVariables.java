public class UpdatingVariables {
    public static void main(String[] args) {
        // Salario base
        int salario = 1000;

        // Bono: $200
        salario = salario + 200;
        System.out.println(salario);

        // Pago de pensión: -$50
        salario = salario - 50;
        System.out.println(salario);

        // 2 horas extra: $30 c/u
        // Gastos de comida: -$45
        salario = salario + (30 * 2) - 45;
        System.out.println(salario);

        // Actualizando cadena de texto
        String nombre = "Ariel";
        nombre = nombre + " Antequiera";
        System.out.println(nombre);
        nombre = "Patricio " + nombre;
        System.out.println("Mi nombre completo es " + nombre);
    }
}