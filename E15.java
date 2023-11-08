import javax.swing.JOptionPane;

public class E15 {
    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(inputNumero);

        StringBuilder tabla = new StringBuilder("Tabla de multiplicar del " + numero + ":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabla.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        JOptionPane.showMessageDialog(null, tabla.toString());
    }
}
