import javax.swing.JOptionPane;

public class E19 {
    public static void main(String[] args) {
        String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");
        int numero = Integer.parseInt(inputNumero);

        StringBuilder tabla = new StringBuilder("Tabla de multiplicar del " + numero + ":\n");
        int i = 1;

        do {
            int resultado = numero * i;
            tabla.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
            i++;
        } while (i <= 10);

        JOptionPane.showMessageDialog(null, tabla.toString());
    }
}
