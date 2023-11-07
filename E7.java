import javax.swing.JOptionPane;

public class E7 {
    
    public static void main(String[] args) {

        String input1= JOptionPane.showInputDialog("Ingresa tu nombre: ");
        String input2= JOptionPane.showInputDialog("Ingresa tu edad: ");

        try {
                
            int edad = Integer.parseInt(input2);

            if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Felicidades " + input1 + ", usted puede votar.");
            } else {
                JOptionPane.showMessageDialog(null, "Una disculpa " + input1 + ", usted no puede votar.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
        }
    }
}
