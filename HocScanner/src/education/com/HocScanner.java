/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 1, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class HocScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhập số nguyên:");
        int a = sc.nextInt();
        System.out.println("Bạn vừa nhập số:" + a);
        
        System.out.println("Nhập số Double:");
        double b = sc.nextDouble();
        System.out.println("Bạn vừa nhập số:" + b);
        
        System.out.println("Mời bạn nhập 1 chuỗi:");
        String c = new Scanner(System.in).nextLine();
        System.out.println("chuỗi:" + c);
    }
}
