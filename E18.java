import javax.swing.JOptionPane;

public class E18 {
    public static void main(String[] args) {
        int n = 1;
        StringBuilder serieNumerica = new StringBuilder("Serie numérica: ");

        while (n * n <= 100) {
            int resultado = n * n;
            serieNumerica.append(resultado).append(", ");
            n++;
        }

        JOptionPane.showMessageDialog(null, serieNumerica.toString());
    }
}