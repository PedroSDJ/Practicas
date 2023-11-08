import javax.swing.JOptionPane;

public class E21 {
    public static void main(String[] args) {
        String inputCantidadAlumnos = JOptionPane.showInputDialog("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = Integer.parseInt(inputCantidadAlumnos);

        int sumaEdades = 0;

        for (int i = 1; i <= cantidadAlumnos; i++) {
            String inputEdad = JOptionPane.showInputDialog("Ingrese la edad del alumno " + i + ":");
            int edad = Integer.parseInt(inputEdad);
            sumaEdades += edad;
        }

        double promedioEdades = (double) sumaEdades / cantidadAlumnos;

        JOptionPane.showMessageDialog(null, "La edad promedio de los " + cantidadAlumnos + " alumnos es: " + promedioEdades);
    }
}