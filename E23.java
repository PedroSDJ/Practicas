import javax.swing.JOptionPane;

public class E23 {
    public static void main(String[] args) {
        StringBuilder numerosPrimos = new StringBuilder("Números primos descendentes entre 0 y 100:\n");

        for (int numero = 100; numero >= 2; numero--) {
            if (esPrimo(numero)) {
                numerosPrimos.append(numero).append(", ");
            }
        }

        JOptionPane.showMessageDialog(null, numerosPrimos.toString());
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}