import javax.swing.JOptionPane;

public class E25 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del empleado:");
        int edad = Integer.parseInt(inputEdad);
        String puesto = JOptionPane.showInputDialog("Ingrese el puesto del empleado (vendedor, administrador, supervisor):");

        double salario = 0;

        switch (puesto.toLowerCase()) {
            case "vendedor":
                salario = 3000;
                break;
            case "administrador":
                salario = 7000;
                break;
            case "supervisor":
                salario = 5000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Puesto no válido. Por favor, ingrese un puesto válido (vendedor, administrador, supervisor).");
                return;
        }

        JOptionPane.showMessageDialog(null, "Empleado: " + nombre + "\nEdad: " + edad + "\nPuesto: " + puesto + "\nSalario: $" + salario);
    }
}
