package exerc_java;
import javax.swing.JOptionPane;

public class pa {
    void pA()
    {
        int a1, r, n, pa;
        a1= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro termo")); 
        r = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a razao")); 
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o termo a ser descoberto"));
        pa=a1+(n-1)*r;
        JOptionPane.showMessageDialog(null, pa);
    }
}
