import javax.swing.*;

public class AreaTri {

    public static void main(String[] args) {

        String base = JOptionPane.showInputDialog(null,"Digite o valor da base: ");
        double baseTri = Double.parseDouble(base);

        String altura = JOptionPane.showInputDialog(null,"Digite o valor da altura: ");
        double alturaTri = Double.parseDouble(altura);

        double area = (baseTri*alturaTri)/2;

        JOptionPane.showMessageDialog(null,"Os valores do triângulo é: Base="+ baseTri + " Altura = " +
                alturaTri + " e sua área é " + area  );


    }

}
