import javax.swing.JOptionPane;

public class E22 {
    public static void main(String[] args) {
        int meses = 12;
        double ahorroAnual = 0;

        for (int mes = 1; mes <= meses; mes++) {
            String inputAhorro = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a ahorrar " + mes + ":");
            double ahorroMensual = Double.parseDouble(inputAhorro);
            ahorroAnual += ahorroMensual;

            JOptionPane.showMessageDialog(null, "Llevas ahorrado en el mes " + mes + ": " + ahorroAnual);
        }

        JOptionPane.showMessageDialog(null, "Ahorro anual: " + ahorroAnual);
    }
}
