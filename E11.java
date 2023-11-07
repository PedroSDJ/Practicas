import javax.swing.JOptionPane;

public class E11 {
    public static void main(String[] args) {

        double pago;
        double Autobus = 4000.00;

        String input = JOptionPane.showInputDialog("Ingrese el número de alumnos:");
        int Alumnos = Integer.parseInt(input);

        if (Alumnos >= 100) {
            pago = 65.00;
        } else if (Alumnos >= 50 & Alumnos <= 99) {
            pago = 70.00;
        } else if (Alumnos >= 30 & Alumnos <= 49 ) {
            pago = 95.00;
        } else {
            pago = Autobus/ Alumnos;
        }

        double costoTotalAlumnos = pago * Alumnos;

        JOptionPane.showMessageDialog(null, "Costo por alumno: $" + pago);
        JOptionPane.showMessageDialog(null, "Pago total para la compañía de autobuses: $" + costoTotalAlumnos);
    }
}
