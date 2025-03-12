import javax.swing.*;

public class FaherenheitToCelsius {

    public static void main(String[] args) {

        String celsius = JOptionPane.showInputDialog(null,"Digite a temperatura");
        double celsiusFa = Double.parseDouble(celsius);

        double conversao = (celsiusFa - 32) * 9/5;
        JOptionPane.showMessageDialog(null,conversao);



        // (F - 32) * 9/5
        // (C*(9/5))+32
        // peso/alt*2

    }
}
