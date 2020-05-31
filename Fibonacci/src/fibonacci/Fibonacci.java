/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Acer
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pnum = 0;
        int nnum = 1;
        int temp = 0;
        int sum = 0;

        do {
            if (nnum % 2 == 0) {
                sum = sum + nnum;
            }
            temp = pnum + nnum;
            pnum = nnum;
            nnum = temp;
        } while (nnum < 4000000);

        System.out.println(sum);
    }

}
