/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;

/**
 *
 * @author wesll
 */
public class Loop implements Runnable {

    protected int j;

    public Loop(int i) {
        j = i;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {            
            System.out.println("Thread "+j+" executado");
            try {
                Thread.sleep(r.nextInt(5000));
            } catch (InterruptedException e) {
            }
        }
    }
}
