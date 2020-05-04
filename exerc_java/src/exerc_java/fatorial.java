package exerc_java;
import javax.swing.JOptionPane;

public class fatorial {

    static void fatorialDo()
    {    
        int fatorial=1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para o calculo do Fatorial!!!"));
        do
        {
            fatorial = fatorial * numero;
            numero--;
        }while(numero>1);
        JOptionPane.showMessageDialog(null, fatorial);
    }
    
    static void fatorialWhile()
    {
        int fatorial=1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para o calculo do Fatorial!!!"));
        while(numero>1)
        {
            fatorial = fatorial * numero;
            numero--;
        }
        JOptionPane.showMessageDialog(null, fatorial);
    }
    
    static void fatorialFor()
    {   
        int fatorial=1, numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para o calculo do Fatorial!!!"));
	for(int i=numero; i>1; i--){		
	    fatorial=fatorial*i;
	}
        JOptionPane.showMessageDialog(null, fatorial);
    }
    
     static int fat_rec(int numero)
    {
        if(numero==0){
            return 1;
        }else{
            return numero*fat_rec(numero-1);
        }
    }
}
