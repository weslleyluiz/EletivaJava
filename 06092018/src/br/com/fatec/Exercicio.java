/*
 * Ler valores inteiros digitados pelo usuario e 
 *  Informar o maior valor lido;
 *  Informar o menor valor lido;
 */
package br.com.fatec;

import javax.swing.JOptionPane;

public class Exercicio {
    public static void main(String[] args) {
        String s, exibe;
        exibe = "Valores lidos:\n";
        int valor, compara, ARMAZENA;
        ARMAZENA = 0;
        compara = 0;
        do{
        s = javax.swing.JOptionPane.showInputDialog("Digite um numero ou \"fim\" pra sair:","fim");
        if(s.toLowerCase().equals("fim")){
            javax.swing.JOptionPane.showMessageDialog(null, "Fim");
            break;
        }else{
            //leitura
            valor = Integer.parseInt(s); 
            exibe += valor + " \n"; 
//          JOptionPane.showMessageDialog(null, exibe);
            if(valor > ARMAZENA){
                JOptionPane.showMessageDialog(null, "Numero Digitado = " + valor + "\nMaior que " + ARMAZENA);
                ARMAZENA = valor;
                
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Numero Digitado = " + valor + "\nMenor que " + ARMAZENA);
                ARMAZENA = compara;
                continue;
            }
                
            compara = valor;
            
        }
        
        }while(true);
        JOptionPane.showMessageDialog(null, exibe + "\nMaior digitado = >" + ARMAZENA);
    }
}
