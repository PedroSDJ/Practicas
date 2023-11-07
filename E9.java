import javax.swing.JOptionPane;

public class E9 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        
        try{
        int numero = Integer.parseInt(input);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
    }
    }
}
