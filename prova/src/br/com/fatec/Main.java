/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;
/**
 *
 * @author wesll
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    private static String msg;
    public String getMensagem(){
        return msg;
    }
    public void setMensagem(String mensagem){
        msg = mensagem;
    }
    public void mostrarMensagem(){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Main m = new Main();
        m.setMensagem("Hello world");
        m.mostrarMensagem();
    }
    
}   