import javax.swing.*;

public class IMC {

    public static void main(String[] args) {

        String peso = JOptionPane.showInputDialog(null,"Digite seu peso: ");
        double pesoP = Double.parseDouble(peso);

        String altura = JOptionPane.showInputDialog(null,"Digite a altura: ");
        double alturaP = Double.parseDouble(altura);

        double imc = pesoP/(alturaP*alturaP);
        JOptionPane.showMessageDialog(null,"O seu IMC é "+String.format("%.2f",imc));


    }

}
