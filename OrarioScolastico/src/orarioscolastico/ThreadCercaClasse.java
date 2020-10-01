/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orarioscolastico;

/**
 *
 * @author pezzano_lisa
 */
public class ThreadCercaClasse extends Thread {

    DatiCondivisi dati;
    int numinsegnante;
    String classe;

    public ThreadCercaClasse(DatiCondivisi dati, String classe, int num) {
        this.dati = dati;
        this.classe = classe;
        numinsegnante = numinsegnante;
    }

    @Override
    public void run() {
    public String[] v = dati.VInsegnati()[numinsegnante].split(",");
    for(int i=0; i<36 ; i++){
        if (v[i].equalsIgnoreCase(classe))
            v[i]=dati.VProf()[numinsegnante];
        }
    dati.SetVect(numinsegnante, v); 
    }

}

