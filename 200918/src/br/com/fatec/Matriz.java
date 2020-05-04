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
public class Matriz {
    private int[][] value;
    
    public void setValue(int[][] value){
        this.value = value;
    }
    
    public int[][] soma(int[][] m){
        int[][] retorno = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; i++){
                retorno[i] [j] = value[i][j] + m[i][j];
            }
        }
        return retorno;
    }
    
    public int[][] sub(int[][] m){
        int[][] retorno = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; i++){
                retorno[i] [j] = value[i][j] - m[i][j];
            }
        }
        return retorno;
    }
    public int[][] escalarMultiply(int escalar){
        int [][] retorno = new int[value.length][value[0].length];
        for (int i = 0; i < retorno.length; i++) {
            for (int j = 0; j < retorno[i].length; i++){
                retorno[i] [j] = value[i][j] * escalar;
            }
        }
        return retorno;
    }
    public int[][] multiply(int[][] m){
        int[][] retorno = new int[value.length][m[0].length];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                for (int k = 0; k < m[j].length; k++) {
                    retorno[i][j] = value[i][j] * 
                }
            }
        }
        return retorno;
    }
}
