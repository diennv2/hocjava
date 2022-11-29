/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 12, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class RenLuyenSwitch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Moi ban nhap he so a: ");
            int a = sc.nextInt();
            System.out.println("Moi ban nhap he so b: ");
            int b = sc.nextInt();
            System.out.println("Moi ban chon phep tinh: ");
            char ch = new Scanner(System.in).nextLine().charAt(0);
            switch(ch) {
            case'+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case'-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case'*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case'/':
                if (b == 0) {
                    System.out.println("Mau = 0");
                } else {
                    System.out.println(a + " / " + b + " = " + (a*1.0/b));
                }
                break;
            default:
                System.out.println("Thim nhap sai phep tinh roi");
                break;
            }
            System.out.println("Ban co muon tiep tuc khong(c/k)");
            String check = new Scanner(System.in).nextLine();
            if (check.equalsIgnoreCase("k")) {
                break;
            }
        }
        System.out.println("Cam on ban da tham gia");
    }

}
