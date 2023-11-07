import javax.swing.JOptionPane;

public class E5 {
    
    public static void main(String[] args) {
        
        double l= 3;
        double Resultado= Math.pow(l, 3);
        String Mensaje= "El volumen del cubo es: " + Resultado;

        JOptionPane.showMessageDialog(null, Mensaje,"Resultado",JOptionPane.PLAIN_MESSAGE);
    }
}
