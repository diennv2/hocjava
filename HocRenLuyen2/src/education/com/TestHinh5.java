/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 13, 2022
 * @version 1.0
*/

package education.com;

public class TestHinh5 {

    public static void Hinh5(int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i+j == h-1 ||j==h/2 ||(i==0 && j>h/2)||(i==h-1 && j<=h/2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Hinh5(11);
    }

}
