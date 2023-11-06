import javax.swing.JOptionPane;

    public class E2 {

        public static void main(String[] args) {
            
            String userInput = JOptionPane.showInputDialog("Ingresa el primer número:");
            String userInput2 = JOptionPane.showInputDialog("Ingresa el segundo número:");

            if (userInput != null & userInput2 != null) {
                try {
                    int Numero1= Integer.parseInt(userInput);
                    int Numero2= Integer.parseInt(userInput2);
                    int Resultado= Numero1 + Numero2;
                    JOptionPane.showMessageDialog(null, "La suma de los dos número es de: " + Resultado);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero válido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
            }
            
        }
    }
