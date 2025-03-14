import javax.swing.*;

public class Delta {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog(null,"Digite o valor de A: ");
        int aDelta = Integer.parseInt(a);

        String b = JOptionPane.showInputDialog(null,"Digite o valor de B: ");
        int bDelta = Integer.parseInt(b);

        String c = JOptionPane.showInputDialog(null,"Digite o valor de C: ");
        int cDelta = Integer.parseInt(c);

        int delta = (bDelta*bDelta) - 4*aDelta*cDelta;
        JOptionPane.showMessageDialog(null,"A:" + aDelta + "\n B:" + bDelta + "\n C:"+ cDelta +
                "\n" +
                " Delta:"+ delta);


    }

}
