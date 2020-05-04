/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author wesll
 */
public class CriaThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i <= 4; i++) {
            Loop loop = new Loop(i);
            Thread t = new Thread(loop);
            t.start();
            System.out.println("thread "+j+" criado");
        }
    }
    
}

