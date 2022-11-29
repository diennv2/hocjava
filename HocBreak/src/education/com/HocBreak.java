/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 5, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class HocBreak {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        while (true) {
            System.out.println("Mời bạn nhập 1 số: ");
            int n = new Scanner(System.in).nextInt();
            if (n % 2 == 0) {
                System.out.println(n + "Số chẵn");
            } else {
                System.out.println(n + "Số lẻ");
            }
            System.out.println("Tiếp không c/k:");
            String line = new Scanner(System.in).nextLine();
            if (line.equalsIgnoreCase("k")) {
                break;
            }
            System.out.println("bye bye");
        }
    }

}
