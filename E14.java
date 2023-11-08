import javax.swing.JOptionPane;

public class E14 {
    public static void main(String[] args) {
        String inputNumero1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String inputNumero2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

        double numero1 = Double.parseDouble(inputNumero1);
        double numero2 = Double.parseDouble(inputNumero2);

        String[] opciones = { "Sumar", "Restar", "Multiplicar", "Dividir" };
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una operación:",
                "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        double resultado = 0;

        switch (seleccion) {
            case 0: // Sumar
                resultado = numero1 + numero2;
                break;
            case 1: // Restar
                resultado = numero1 - numero2;
                break;
            case 2: // Multiplicar
                resultado = numero1 * numero2;
                break;
            case 3: // Dividir
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
    }
}
