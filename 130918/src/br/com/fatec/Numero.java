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
/*
 * Classe : Numeros.
 * Valores : int[]
 * le Valores() : void
 * achaMaior() : int
 * achaMenor() : int
 * multiplicaValores(valor:int):void
 * ordenaValores():void
 * mostraValores():void
 */
public class Numero {
    
    public int[] valores;
    public void leValores(){
        int valor, compara, ARMAZENA;
        ARMAZENA = 0;
        compara = 0;
        String s, exibe;
        exibe = "";
        do{
        s = javax.swing.JOptionPane.showInputDialog("Digite um numero ou \"fim\" pra sair:");
        if(s.toLowerCase().equals("fim")){
            javax.swing.JOptionPane.showMessageDialog(null, "Fim");
            break;
        }else{
            //leitura
            valor = Integer.parseInt(s); 
            exibe += valor + " "; 
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
        String[] vetorConverter = exibe.split(" ");
        valores = new int[vetorConverter.length];
        for (int i = 0; i < vetorConverter.length; i++) 
            valores[i] = Integer.parseInt(vetorConverter[i]);    
    }
    
    public void mostraValores(){
        if(null!=valores)
        {
            String s = "";
            for (int i = 0; i < valores.length; i++) {
                s += valores[i] + " ";
            }
            System.out.println(s);
        }
    }
    public void multiplicaValor(int valor){
        if(null!= valores){
            for(int i : valores)
                System.out.println(valor + " * " + i +" = "+ i*valor);
        }
    }
    public int achaMenor(){
        int menor = Integer.MAX_VALUE; 
        for (int i = 0; i < valores.length; i++) {
            if(valores[i] < menor){
                 menor = valores[i];
            } 
        }
        return menor;
    }

    public int achaMaior() {
        int ARMAZENA = Integer.MIN_VALUE;
        if(null != valores){
            int valor = valores[0];
            int compara;
            for (int i = 0; i < valores.length; i++) {
                if(valores[i] > ARMAZENA){
                    ARMAZENA = valores[i];    
                } 
            }
        }
        return ARMAZENA;
    }
    public void ordenaValores(){
        if(null!=valores){
            int aux;
            int i = valores.length;
            boolean loop = true;
            while(loop){
                loop = false;
                for (int j = 0; j < i; j++) {
                    for (int k = 0; k < i - j - 1; k++) {
                        if(valores[k] > valores[k +1]){
                            aux = valores[k];
                            valores[k] = valores[k+1];
                            valores[k + 1] = aux;
                        }
                    }
                }
            }
        }
    }
}