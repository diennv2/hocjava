/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 13, 2022
 * @version 1.0
*/

package education.com;

public class TestHinhB {
    public static void HinhB (int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HinhB(10);
    }

}
