/*
 * This application decomposes the factual of a given number n;
 * n is specified by the user;
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 09.01.2018
 */
public class FactorRuns {

    int n;

    /**
     * @param args the command line arguments n - is specified by the user
     */
    public static void main(String[] args) {
        int n;
        try (
                // TODO code application logic here
                Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число, по котрому нужно вычислить факториал"
                    + "\n" + "ВНИМАНИЕ!!! число n должно быть больше 4 и менше 16");
            n = sc.nextInt();
        }

        if (n > 4 & n < 16) {
            int fact = 1;
            for (int i = 1; i <= n; i += 1) {
                fact *= i;
            }
            {
                System.out.println("Факториал " + "числа: " + n + "! = " + fact);
            }

        } else {
            System.out.println("Число не соответсвует условию!");
        }

    }

}
