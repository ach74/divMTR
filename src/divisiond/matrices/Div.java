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
public class Div {

    public Div() {

    }
    Scanner t = new Scanner(System.in);

    int x, y;

    boolean divs = false;

    private int a[][];

    private int[][] crea() {

        System.out.println("Introduce un valor para la matriz (x)");
        x = t.nextInt();
        System.out.println("Introduce un valor para la matriz (y)");
        y = t.nextInt();

        a = new int[x][y];

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

        //System.out.println(a.length);
    }

    private void dividir() {

        if (x % 2 == 0 && y % 2 == 0) {
            x = x / 2;
            y = y / 2;
            divs = true;
        } else {
            divs = false;
        }

    }

    public static void main(String[] args) {
        //Llamar al constructor
        Div d = new Div();
        d.crea();
        d.imprimir();

        System.out.println(d.x);
        System.out.println(d.y);

        System.out.println("---------");
        d.dividir();

       while (d.divs==true) {
            d.dividir();
            d.imprimir();
            System.out.println("---------");
        }

    }

}
