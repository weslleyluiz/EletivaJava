package exerc_java;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class pg 
{
    void pg()
    {
        int a1, q, n, pg;
        a1= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro termo")); 
        q = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a razao")); 
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o termo a ser descoberto"));
        pg=(int) (a1*pow(q, n-1));
        JOptionPane.showMessageDialog(null, pg);
    }
}
