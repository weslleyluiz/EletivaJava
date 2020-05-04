/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulaOrientacaoObjetos;
import static java.lang.Math.pow;
/**
 *
 * @author wesll
 */
public class Math {
    public static int CalculaPa(int termo1, int termoX, int razao){
        return termo1 + ((termoX-1)*razao);
    }
    
    public static int CalculaPg(int termo1, int termoX, int razao){
        return (int) (termo1*pow(razao,termoX-1 ));
    }
}
