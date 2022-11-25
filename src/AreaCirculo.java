import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        double area = 0.0;
        double radio = 0.0;
        try {
            radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog (null, "Debe ingresar un número");
            main(args);
        }
        area = Math.PI * Math.pow(radio,2);
        JOptionPane.showMessageDialog(null, "El área de un círculo de radio " + radio + " es igual a " + area);
        System.exit(0);
    }
}
