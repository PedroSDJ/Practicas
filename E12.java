import javax.swing.JOptionPane;

public class E12 {
    public static void main(String[] args) {
        try{
            String input = JOptionPane.showInputDialog("Ingrese un número del 1 al 7:");
            int dia = Integer.parseInt(input);

            String diaDeLaSemana;

            switch (dia) {
                case 1:
                    diaDeLaSemana = "Lunes";
                    break;
                case 2:
                    diaDeLaSemana = "Martes";
                    break;
                case 3:
                    diaDeLaSemana = "Miércoles";
                    break;
                case 4:
                    diaDeLaSemana = "Jueves";
                    break;
                case 5:
                    diaDeLaSemana = "Viernes";
                    break;
                case 6:
                    diaDeLaSemana = "Sábado";
                    break;
                case 7:
                    diaDeLaSemana = "Domingo";
                    break;
                default:
                    diaDeLaSemana = "Número inválido. Debe ser un número del 1 al 7.";
                    break;
                }
                if (dia >= 1 & dia <= 7) {
                    JOptionPane.showMessageDialog(null, "El día es " + diaDeLaSemana);
            } else {
                    JOptionPane.showMessageDialog(null, diaDeLaSemana);
            }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese un números del 1 a al 7.");
            }

    }
}
