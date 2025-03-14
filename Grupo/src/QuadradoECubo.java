import javax.swing.*;

public class QuadradoECubo {

    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog(null,"Digite um número: ");
        int numero = Integer.parseInt(num);

        int quad = numero*numero;
        int cubo = numero*numero*numero;

        JOptionPane.showMessageDialog(null,"O número "+ numero + " elevado ao quadrado é "+
                quad + " e elevando ao cubo é "+ cubo);

    }

}
