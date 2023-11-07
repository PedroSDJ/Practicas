import javax.swing.JOptionPane;

    public class E6 {

        public static void main(String[] args) {
        
            String input1= JOptionPane.showInputDialog("Ingresar el primer número:");
            String input2= JOptionPane.showInputDialog("Ingresar el segundo número:");

            try {
                
                int Numero1 = Integer.parseInt(input1);
                int Numero2 = Integer.parseInt(input2);

                if (Numero1 > Numero2) {
                    JOptionPane.showMessageDialog(null, "El número " + Numero1 + " es mayor que " + Numero2 + ".");
                } else if (Numero2 > Numero1) {
                    JOptionPane.showMessageDialog(null, "El número " + Numero2 + " es mayor que " + Numero1 + ".");
                } else {
                    JOptionPane.showMessageDialog(null, "Los números son iguales.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
            }
        }
    }