import javax.swing.*;

public class CelsiusToFaherenheit {

    public static void main(String[] args) {

        String faherenheit = JOptionPane.showInputDialog(null, "Digite a temperatura");
        double fahCel = Double.parseDouble(faherenheit);


        double conv = (fahCel * 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, conv);
    }
}