package exerc_java;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.math.BigDecimal;

public class media 
{
    //https://docs.oracle.com/javase/8/docs/api/
    float  prova2, trabalho1, trabalho2, media;
    BigDecimal prova1 = new BigDecimal("0");
    void mediaAluno()
    {   
        prova1 = new BigDecimal(JOptionPane.showInputDialog(null, "Insira a nota da prova 1")));
//                (Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota da prova 1"))); // Pegar primeiro input
        prova2 = (Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota da prova 2"))); // Pegar segundo input   
        trabalho1 = (Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do trabalho 1"))); // Pegar primeiro input
        trabalho2 = (Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota do trabalho 2"))); // Pegar segundo input


        //media = ((float) ((prova1*0.7 + trabalho1*0.3 + prova2*0.7 + trabalho2*0.3)/2));
        DecimalFormat df = new DecimalFormat("#.##");
        //JOptionPane.showMessageDialog(null, "Sua media final e: " + new DecimalFormat("#.##").format(media));
        
        JOptionPane.showMessageDialog(null, "Sua media final e: "+df.format(media));
        if (media>6)
        {
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        else
        {
            prova1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Reprovado, digite a nota da recuperacao"));
            media=(media+prova1)/2;
            if(media>6)
            {
                JOptionPane.showMessageDialog(null,"Aprovado");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Reprovado");
            }
        }
    }

    private float BigDecimal(float parseFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
