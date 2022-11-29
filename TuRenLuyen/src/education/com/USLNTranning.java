/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 14, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class USLNTranning {
    public static int UCLN(int a, int b) {
        while (a!=b) {
            if (a > b) {
                a = a - b;
                System.out.println("a "+a);
            } else {
                b = b - a;
                System.out.println("b "+b);
            }
        } 
        return (a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập số b: ");
        int b = sc.nextInt();
        
        int ucln = UCLN(a, b);
//        int bcnn = (a*b)/UCLN(a, b);
        System.out.println("UCLN("+ a +", "+b+") la "+ ucln);
//        System.out.println("BCNN("+ a +", "+b+") la "+ bcnn);
        
    }
    
}
