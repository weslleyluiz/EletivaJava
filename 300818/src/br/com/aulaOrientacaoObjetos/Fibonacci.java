package br.com.aulaOrientacaoObjetos;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wesll
 */
public class Fibonacci {
    public static int FibbonaciFor(int termo){
        try {
            int[] fib = new int[(termo+1)];
            for (int i = 0; i < termo; i++) 
                fib[i] = 0; 
            fib[0] = 0;
            fib[1] = 1;  
            for(int i = 2; i<=termo;i++){
                fib[i] = fib[i-1] + fib[i-2]; 
            }
            return fib[termo];
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public static int FibbonaciDoW(int termo){
        int[] fib = new int[termo+1];
        for (int i = 0; i < termo; i++) 
                fib[i] = 0; 
        fib[0] = 0;
        fib[1] = 1;
        int i = 2;
        do{
            fib[i] = fib[i-1] + fib[i-2];
            i++;
        }while(i>=termo);
        return fib[termo];
    }
    public static int FibbonaciWhile(int termo){
        int[] fib = new int[termo+1];
        for (int i = 0; i < termo; i++) 
            fib[i] = 0; 
        fib[0] = 0;
        fib[1] = 1;
        int i = 2;
        do{
            fib[i] = fib[i-1] + fib[i-2];
            i++;
        }while(i>=termo);
        return fib[termo];
    }
    public static int FibbonaciRecursivo(int i) {
        if(i == 0 || i == 1){
            return i;
        }
        else{ 
            return (FibbonaciRecursivo(i-1)+FibbonaciRecursivo(i-2));
        }
    }
}