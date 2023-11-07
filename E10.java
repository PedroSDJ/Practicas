import javax.swing.JOptionPane;

public class E10 {
    public static void main(String[] args) {
        try{
            double Platillo = 95.00;

            String input = JOptionPane.showInputDialog("Ingrese el número de personas:");
            int Personas = Integer.parseInt(input);

            double costoTotal;

            if (Personas > 300) {
                costoTotal = Personas * (Platillo - 20.00);
            } else if (Personas > 200 & Personas <= 300) {
                costoTotal = Personas * (Platillo - 10.00);
            } else {
                costoTotal = Personas * Platillo;
            }

            JOptionPane.showMessageDialog(null, "El costo total del banquete para " + Personas + " personas es de: $" + costoTotal);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
        }
        }
}
