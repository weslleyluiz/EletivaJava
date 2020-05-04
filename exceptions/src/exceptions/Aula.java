/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import javax.swing.JOptionPane;
/**
 *
 * @author wesll
 */
public class Aula implements Teste{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodo();
        Aula a = new Aula();
        a.metodoTeste();
    }
    static void metodo(){
        try {
            int a, b, r;
        String s;
        s = JOptionPane.showInputDialog("Digite um valor inteiro");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("Digite um valor inteiro:");
        b = Integer.parseInt(s);
        r = a/b;
        JOptionPane.showMessageDialog(null,"A divisao de "+ a + " por " + b + " é igual a "+ r);
        
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tente Novamente");
        }
    }
    @Override
    public void metodoTeste() {
        throw new MyException("erro");
    }   
}