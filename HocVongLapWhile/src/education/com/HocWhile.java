/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 2, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class HocWhile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một giá trị");
        int n = scanner.nextInt();
        int gt = 1;
        int i = 1;
        while (i<=n) {
            gt *=i;
            i++;
        }
        System.out.println(n + " !=" + gt);
    }

}
