/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiond.matrices;

import java.util.*;

/**
 *
 * @author dam1a07
 */
public class MatrizPar {

    private int m, n;
    private boolean divs;
    private int a[][];

    public MatrizPar() {
        this.divs = false;
    }
    private int[][] crear() {
        a = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        return a;
    }

    private void imprimir() {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("[ " + a[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private boolean comprovar() {

        if (m % 2 == 0 && n % 2 == 0) {
            m = m / 2;
            n = n / 2;
            divs = true;
            return divs;
        } else {
            divs = false;
            return divs;
        }
    }

    public static void main(String[] args) {
        

        MatrizPar m = new MatrizPar();
        Scanner t = new Scanner(System.in);
        System.out.println("Introduce un valor para la matriz (x)");
        m.m = t.nextInt();
        System.out.println("Introduce un valor para la matriz (y)");
        m.n = t.nextInt();
        
        m.crear();
        m.imprimir();

        while (m.comprovar() == true) {
            m.crear();
            m.imprimir();
        }
    }

}
