/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudorandom;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rounakchawla
 */
public class Pseudorandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p = Math.random();
        System.out.println("Parameter = " + p);
        for (int i = 0; i < 100; i++) {
            System.out.println(binomial(p, 9));

        }
    }

    static double geometric(double p) {
        double param = 1 - p;
        double denom = Math.log(param);
        double num = Math.log(Math.random());
        double result = num / denom;
        result = Math.ceil(result);
        return result;
    }

    static double poisson(int lambda) {
        int neg = 0 - lambda;
        double power = Math.exp(neg);
        int k = 0;
        double p = 1.0;
        do {
            k = k + 1;
            double rand = Math.random();
            p = p * rand;
        } while (p > power);

        return k - 1;

    }

    static int binomial(double p, int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
            double rand = Math.random();
            if (rand < p) {
                num++;
            }
        }
        return num;
    }

}
