public class DataTypes {
    public static void main(String[] args) {
        // Existen también tipos de datos númericos más pequeños:byte y short.
        
        // Integer types
        int n = 1234567890;

        // Long types
        long nL = 12345678901L;

        // Float types
        float nF = 123.456F;
        
        // Double types
        double nD = 123.456123456;
        
        var salario = 1000; // integer
        // Pensión 3% del salario
        var pension = salario * 0.03; // double
        var salarioTotal = salario - pension;
        
        System.out.println(salario);
        System.out.println(pension);
        System.out.println(salarioTotal);

        var nombreEmpleado = "Ariel Antequiera";
        System.out.println("El empleado es " + nombreEmpleado + ", su salario es" + salario);
    }
}

// Para usar var (y la inferencia de los tipos de datos) la jdk debe ser desde ka versión 10 en adelante.