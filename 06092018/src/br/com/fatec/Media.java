/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.math.BigDecimal;

/**
 *
 * @author wesll
 */
public class Media {

    public BigDecimal nota1, nota2, trabalho1,trabalho2,media;
    public Media() {
        nota1 = new BigDecimal("0");
        nota2 = new BigDecimal("0");
        trabalho1 = new BigDecimal("0");
        trabalho2 = new BigDecimal("0");
        media = new BigDecimal("0");
    }
    
    public void SetNota1(String s){
        nota1 = new BigDecimal(s);
    }
    public void SetNota2(String s){
        nota2 = new BigDecimal(s);
    }
    public void SetTrabalho1(String s){
        trabalho1 = new BigDecimal(s);
    }    
    public void SetTrabalho2(String s){
        trabalho2 = new BigDecimal(s);
    }
    public BigDecimal CalcMedia(){   
        return nota1.multiply(new BigDecimal("0.7"))
                .add(nota2.multiply(new BigDecimal("0.7")))
                .add(trabalho1.multiply(new BigDecimal("0.3")))
                .add(trabalho2.multiply(new BigDecimal("0.3")));
    }
    
    
}
