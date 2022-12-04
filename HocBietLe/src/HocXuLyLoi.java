/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author DienNguyen
 * @date Dec 4, 2022
 * @version 1.0
*/

public class HocXuLyLoi {
    /**
     * @param args
     */
    public static void main (String [] args) {
        try {
            int x, y, z;
            x = 3;
            y = x+ 3;
            x = 3/5;
            z = 8/x;
        } catch (Exception e) {
            System.out.println("Lỗi rùi");
            e.printStackTrace();
        }
        
    }
}
