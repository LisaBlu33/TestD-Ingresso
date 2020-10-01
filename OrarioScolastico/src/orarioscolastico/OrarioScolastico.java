/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orarioscolastico;

import java.util.Scanner;

/**
 *
 * @author pezzano_lisa
 */
public class OrarioScolastico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi dati= new DatiCondivisi();
        Scanner s = new Scanner(System.in);
        String classe="";

        System.out.println("Inserire il la classe");
        classe = s.nextLine();
        
        ThreadCercaClasse th1 = new ThreadCercaClasse(dati,classe,0);
        ThreadCercaClasse th2 = new ThreadCercaClasse(dati,classe,1);
        ThreadCercaClasse th3 = new ThreadCercaClasse(dati,classe,2);
        ThreadCercaClasse th4 = new ThreadCercaClasse(dati,classe,3);
        ThreadCercaClasse th5 = new ThreadCercaClasse(dati,classe,4);
        ThreadCercaClasse th6 = new ThreadCercaClasse(dati,classe,5);
        ThreadCercaClasse th7 = new ThreadCercaClasse(dati,classe,6);
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        
        try {
                    th1.join();
                    th2.join();
                    th3.join();
                    th4.join();
                    th5.join();
                    th6.join();
                    th7.start();
                    
                } catch (InterruptedException e) {
                }
        
        dati.Stampa();
    }

}
