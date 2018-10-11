/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulajava;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SolTorresHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Numero de discos na torre de hanoi?");
        int n = stdin.nextInt();
        TorresHanoi t = new TorresHanoi();
        t.moverDiscos(n, 'A', 'C', 'B');
        t.escreveTotalMovimentos();
    }
    
}
