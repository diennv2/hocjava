/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 9, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class GiaiPTCB2 {

    /**
     * Giai phuong trinh can bac 2
     * @param a - he so a
     * @param b - he so b
     * @param c - he so c
     */
    public static void giaiPTB2(double a, double b, double c) {
        if (a==0) {
            System.out.println("Phuong trinh bac 1: ");
            if (b==0 && c == 0) {
                System.out.println("Phuong trinh vo so ngiem");
            } else if (b==0 && c!=0) {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double delta = b * b - 4*a*c;
            if (delta<0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta ==0) {
                System.out.println("PPhuong trinh co nghiem kep: " + (-b/2*a));
            } else {
                double x1= (-b-Math.sqrt(delta))/2*a;
                double x2= (-b+Math.sqrt(delta))/2*a;
                System.out.println("Phuong trinh co nghiem la: x1 " + x1 +" va x2: " + x2);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("GIAI PHUONG TRINH CAN BAC 2:");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi ban nhap he so a:");
            double a = sc.nextInt();
            System.out.println("Moi ban nhap he so b:");
            double b = sc.nextInt();
            System.out.println("Moi ban nhap he so c:");
            double c = sc.nextInt();
            giaiPTB2(a, b, c);
            System.out.println("Nua ko thim?(c/k)");
            String check = new Scanner(System.in).nextLine();
            if (check.equalsIgnoreCase("k")) {
                break;
            }
        } while (true);
        System.out.println("Cam on thim");

    }

}
