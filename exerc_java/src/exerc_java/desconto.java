package exerc_java;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class desconto
{
    float preco;
    String opcao;   
    void descontaoAluno()
    {    
        preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preco"));
        opcao= (JOptionPane.showInputDialog(null,"Escolha a letra correspondente para o desconto\n\n"+"A - 5% \n"
        + "B - 10%\n"+"C - 15%\n"+" D - 30%\n"+" E - 40%\n"));
        DecimalFormat df = new DecimalFormat("#.##");
        switch(opcao)
        {
            case "A": JOptionPane.showMessageDialog(null, df.format((preco-(preco*0.05))));
                break;
            case "B":JOptionPane.showMessageDialog(null,  df.format(preco-(preco*0.01)));
                break;
            case "C":JOptionPane.showMessageDialog(null,  df.format(preco-(preco*0.015)));
                break;
            case "D":JOptionPane.showMessageDialog(null,  df.format(preco-(preco*0.03)));
                break;
            case "E":JOptionPane.showMessageDialog(null,  df.format(preco-(preco*0.04)));
                break;
        }
    }
}
