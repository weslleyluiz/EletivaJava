package exerc_java;
import javax.swing.JOptionPane;

public class fibonacci {
            
    static void fiboDoWhile()
    {
        int termo, sup=0, ant=0, atu=1;
        termo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ate qual termo deseja calcular o fibonaci?"));
        do
        {
            sup = ant + atu;
            ant = atu;
            atu = sup;  
            termo--;
        }while(termo>2);
        JOptionPane.showMessageDialog(null, sup);       
    }
    
    static void fiboWhile()
    {
        int termo, sup=0, ant=0, atu=1;
        termo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ate qual termo deseja calcular o fibonaci?"));
        while(termo>2)
        {   
            sup = ant + atu;
            ant = atu;
            atu = sup;  
            termo--;
        }
        JOptionPane.showMessageDialog(null, sup);  
    }     
    
    static void fiboFor()
    {
        int termo, sup=0, ant=0, atu=1;
        termo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ate qual termo deseja calcular o fibonaci?"));
        for(int i=2;i<termo;i++)
        {
            sup = ant + atu;
            ant = atu;
            atu = sup;   
        } 
        JOptionPane.showMessageDialog(null, sup);
    }
    
    static int f_rec(int termo)
    {
        if(termo<=3)
        {
            return 1;
        }
        else
        {
            return f_rec(termo-1)+f_rec(termo-2);
        }
    }
}
