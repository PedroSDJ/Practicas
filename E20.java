import javax.swing.JOptionPane;

public class E20 {
    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;

        JOptionPane.showMessageDialog(null, "Intenta adivinar el número secreto entre 1 y 100.");

        int numeroUsuario;

        do {
            String input = JOptionPane.showInputDialog("Ingresa tu intento:");
            numeroUsuario = Integer.parseInt(input);
            intentos++;

            if (numeroUsuario == numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Felicidades, has adivinado el número secreto " + numeroSecreto + " en " + intentos + " intentos.");
            } else if (numeroUsuario < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Error, el número secreto es mayor. Sigue intentando.");
            } else {
                JOptionPane.showMessageDialog(null, "Error, el número secreto es menor. Sigue intentando.");
            }
        } while (numeroUsuario != numeroSecreto);
    }
}
