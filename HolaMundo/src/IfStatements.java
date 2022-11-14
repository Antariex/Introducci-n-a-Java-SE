public class IfStatements {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;


        if (isBluetoothEnabled) {
            // Send File
            fileSended ++;
            System.out.println("Archivo enviado");
        } else {
            fileSended --;
            System.out.println("Por favor, encienda su bluetooth para iniciar la tranferencia");
        };

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
