/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 5, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class HocFor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hãy nhập một số bất kỳ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println(n + " != " + gt);
    }

}
