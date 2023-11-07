import javax.swing.JOptionPane;

public class E8 {
    
    public static void main(String[] args) {

        double sumaCalificaciones = 0;
       
        try{

            for (int i = 1; i <= 4; i++) {
                String input = JOptionPane.showInputDialog("Ingrese la calificación de la materia " + i + ":");
                double calificacion = Double.parseDouble(input);
                sumaCalificaciones += calificacion;
                }
            
            double promedio = sumaCalificaciones / 4;
            
                JOptionPane.showMessageDialog(null, "El promedio del alumno es: " + promedio);
            
            if (promedio >= 8.0) {
                        JOptionPane.showMessageDialog(null, "El alumno está aprobado.");
            } else {
                        JOptionPane.showMessageDialog(null, "El alumno está reprobado.");
                }
            
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, ingrese números enteros válidos.");
         }
    }
}