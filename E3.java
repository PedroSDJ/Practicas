import javax.swing.JOptionPane;

    public class E3 {

        public static void main(String[] args) {
        
            String userInput = JOptionPane.showInputDialog("Ingresar el valor de la base:");
            String userInput2 = JOptionPane.showInputDialog("Ingresar el valor de la altura:");

                if (userInput != null & userInput2 != null) {
                    try {
                        int base= Integer.parseInt(userInput);
                        int altura= Integer.parseInt(userInput2);
                        int Resultado= base * altura;
                        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + Resultado);

                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un número entero válido.");
                    }
                } else {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
            }
    }
    }   