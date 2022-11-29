/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 13, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class TinhS {
    /**
     * 
     * @param n
     * @param x
     * @return
     */
    public static double Tinh(int n, int x) {
        
        double s = 0;
        double mau = 0;
        for (int i = 1; i <= n; i++) {
            double tu = Math.pow(x, i);
            mau = mau + i;
            s=s + tu/mau;
            System.out.println("s " + s);
        }
        return s;
        
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        int n = sc.nextInt();
        System.out.println("Mời bạn nhập số b: ");
        int x = sc.nextInt();
        double s = Tinh(x, n);
        System.out.println("S (" + n + "," + x +") = " + s);
    }

}
