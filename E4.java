import javax.swing.JOptionPane;

public class E4 {
    public static void main(String[] args) {

       double r= 5;
        double pi= Math.PI;
        double Resultado= pi * Math.pow(r, 2);
        String Mensaje= "El área del circulo es: " + Resultado;

        JOptionPane.showMessageDialog(null, Mensaje,"Resultado",JOptionPane.PLAIN_MESSAGE);

    }
}
