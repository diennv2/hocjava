/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 14, 2022
 * @version 1.0
 */

package education.com;

import java.util.Scanner;

public class KiemTraSoHoanThien {

    public static boolean KT(int a) {
        int s = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                s = s + i;
            }
        }
        if (s == a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập số tự nhiên bất kỳ: ");
            int a = sc.nextInt();

            boolean check = KT(a);
            if (a < 0) {
                System.out.println("Đây không phải số nguyên dương");
            } else {
                if (check == true) {
                    System.out.println("Số " + a + " là số hoàn hảo");
                } else {
                    System.out.println("Số " + a + " không phải số hoàn hảo");
                }
            }
            System.out.println("Bạn có muốn tiếp tục không(c/k):");
            String str = new Scanner(System.in).nextLine();
            
            if(str.equalsIgnoreCase("k")) {
                break;
            }
        }
        System.out.println("Cám ơn bạn đã tham gia");
    }

}
