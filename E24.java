import javax.swing.JOptionPane;

public class E24 {
    public static void main(String[] args) {
        String inputLimite = JOptionPane.showInputDialog("Ingrese el límite para la secuencia de Fibonacci:");
        int limite = Integer.parseInt(inputLimite);

        int a = 0;
        int b = 1;
        int c = 0;

        StringBuilder secuenciaFibonacci = new StringBuilder("Secuencia de Fibonacci hasta " + limite + ": ");

        while (c <= limite) {
            secuenciaFibonacci.append(c).append(", ");

            a = b;
            b = c;
            c = a + b;
        }

        JOptionPane.showMessageDialog(null, secuenciaFibonacci.toString());
    }
}