import javax.swing.JOptionPane;

public class E16 {
    public static void main(String[] args) {
        StringBuilder numerosPares = new StringBuilder("Números pares: ");

        for (int i = 0; i <= 100; i += 2) {
            numerosPares.append(i).append(", ");
        }
        
        JOptionPane.showMessageDialog(null, numerosPares.toString());
    }
}
