import javax.swing.JOptionPane;

public class E13 {
    public static void main(String[] args) {
        
        String genero = JOptionPane.showInputDialog("Ingrese el género (Hombre o Mujer):");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));

        String tipoVacuna = "";

        if (edad > 70) {
            tipoVacuna = "C";
        } else if (edad >= 16 & edad <= 69) {
            if (genero.equalsIgnoreCase("Mujer")) {
                tipoVacuna = "B";
            } else if (genero.equalsIgnoreCase("Hombre")) {
                tipoVacuna = "A";
            }
        } else if (edad < 16) {
            tipoVacuna = "A";
        }
        JOptionPane.showMessageDialog(null, "Tipo de vacuna a aplicar: " + tipoVacuna);
    }
}
