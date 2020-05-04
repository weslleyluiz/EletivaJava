/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author wesll
 */
public class Numero {
    public int[] valores;
    public void leValores(){
        int valor, compara, ARMAZENA, i;
        i = 0;
        ARMAZENA = 0;
        compara = 0;
        String s;
        do{
        s = javax.swing.JOptionPane.showInputDialog("Digite um numero ou \"fim\" pra sair:");
        if(s.toLowerCase().equals("fim")){
            javax.swing.JOptionPane.showMessageDialog(null, "Fim");
            break;
        }else{
            //leitura
            valor = Integer.parseInt(s); 
            valores[i] = 
//          JOptionPane.showMessageDialog(null, exibe);
            if(valor > ARMAZENA){
                javax.swing.JOptionPane.showMessageDialog(null, "Numero Digitado = " + valor + "\nMaior que " + ARMAZENA);
                ARMAZENA = valor;    
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, "Numero Digitado = " + valor + "\nMenor que " + ARMAZENA);
                ARMAZENA = compara;
                continue;
            }    
            compara = valor;
        }
        
        }while(true);
    }
}
