/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aulaOrientacaoObjetos;

/**
 *
 * @author wesll
 */
public class Fatorial {
    public static int FatorialDoW(int n) {
        int f = 1;
        int i = 2;
        do {
            f *= i;
        } while (i < n);
        return f;
    }
    public static int FatorialWhile(int n) {
        int f = 1;
        int i = 2;
        while (i < n) {
            f *= i;
        }
        return f;
    }
    public static int FatorialRecursivo(int n) {
        if (n != 0) {
            return n * Fatorial.FatorialRecursivo(n - 1);
        } else {
            return 1;
        }
    }
    public static int FatorialFor(int n) {
        int fat = 1;
        for (int i = 2; i < n; i++) {
            fat *= i;
        }
        return fat;
    }
}
