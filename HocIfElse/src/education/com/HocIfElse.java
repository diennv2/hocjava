/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 2, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class HocIfElse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Mời bạn nhập tháng ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (t == 1 || t == 3 || t == 5 || t == 7 || t == 8 || t == 10 || t == 12) {
            System.out.println("Tháng "+t+" có 31 ngày");
        } else if (t==4 || t ==6 ||t==9 || t==11) {
            System.out.println("Tháng " + t + "có 30 ngày ");
        } else if (t == 2) {
            System.out.println("Tháng " + t + "có 28 hoặc 29 ngày");
        } else {
            System.out.println("Tháng lớn hơn hoặc bé hơn 12");
        }
    }

}
