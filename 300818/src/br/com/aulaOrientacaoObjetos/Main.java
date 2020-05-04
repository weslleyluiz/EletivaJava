package br.com.aulaOrientacaoObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author wesll
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) { 
        Fatorial fat = new Fatorial();
    
        String escolha = "0";
        JOptionPane.showMessageDialog(null,"Aula 30-08");
        escolha = JOptionPane.showInputDialog("Menu\n"
                + "01 - Media fatec\n"
                + "02 - Ajuste de preco\n"
                + "03 - Fibonacci ( do/while ) \n"
                + "04 - Fibonacci ( while ) \n"
                + "05 - Fibonacci ( for )\n"
                + "06 - Fibonacci (Recursividade)\n"
                + "07 - Fatorial (while)\n"
                + "08 - Fatorial (do - while)"
                + "09 - Fatorial (for)"
                + "10 - Fatorial (Recursividade)\n"
                + "11 - PA (while)\n"
                + "12 - PG (do-while)\n"
                + "13 - Sair"); 
        if(null != escolha)switch (escolha) {
            case "1":case "01":
                float p1 = 0, p2 = 0, t1 = 0, t2 = 0, media = 0, mediafinal = 0;
                 
                p1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 1:"));
                p2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da prova 2:"));
                t1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho 1:"));
                t2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do trabalho 2:"));
                
                if(MediaEAjuste.MediaFatec(p1,p2,t1,t2) > )
                JOptionPane.showMessageDialog(null,);
                break;
            case "2":case "02":
                AjustePreco();
                break;
            case "3":case "03":
                int f = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fibonacci desejado:"));
                JOptionPane.showMessageDialog(null, Fibonacci.FibbonaciFor(f));
                break;
            case "4":case "04":
                int h = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                JOptionPane.showMessageDialog(null,Fibonacci.FibbonaciWhile(h));
                break;
            case "5":case "05":
                int i = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                Fibonacci.FibbonaciFor(i);
                break;
            case "6":case "06":
                int j = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o termo fibonacci desejado"));
                JOptionPane.showMessageDialog(null,"termo desejado: "+j+ "\n valor => "+Fibonacci.FibbonaciRecursivo(j-1));;
                break;
            case "7":case "07":
                int l = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+l+ "\nvalor => "+ fat.FatorialWhile(l));
                break;
            case "8":case "08":
                int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+m+"\nvalor => "+fat.FatorialDoW(m));
                break;
            case "9":case "09":
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+n+"\nvalor => "+fat.FatorialFor(n));
                break;
            case "10":
                int o = Integer.parseInt(JOptionPane.showInputDialog("Digite o termo fatorial desejado:"));
                JOptionPane.showMessageDialog(null, "termo desejado: "+o+"\nvalor => "+fat.FatorialRecursivo(o));
                break;
            case "11":break;
            case "12":break;
            case "13":
                JOptionPane.showMessageDialog(null, "Saindo!"); 
                enterMenu = false;
                return;
            default:
                break;
        }
        Menu();
        
        
    }   
}