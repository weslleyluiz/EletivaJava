/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;
import java.util.ArrayList;
/**
 *
 * @author wesll
 */
public class Main {
/// 
    int array[];
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> asdf = new ArrayList<Integer>();
        java.util.ArrayDeque<Object> deque = new java.util.ArrayDeque<Object>();
        
        for(int i=0; i <= 123; i++){
            asdf.add(i);
            System.out.println(i);
        }
        
        for(int i = 0;i <=8; i++){
            deque.add(i);
            System.out.println(i);
        }
        System.out.println(asdf.size());
    }
    
}
