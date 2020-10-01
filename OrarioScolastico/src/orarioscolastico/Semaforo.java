/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orarioscolastico;

/**
 * 
 * CLASSE che gestisce la signal() e la wait() di un semaforo
 * @author pezzano_lisa
 */
public class Semaforo {

    private int cont;

    public Semaforo(int cont) {
        this.cont = cont;
    }

    synchronized public void Wait() {
        while (cont == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        cont--;
    }

    synchronized public void Signal() {
        cont++;
        notify();
    }
}
