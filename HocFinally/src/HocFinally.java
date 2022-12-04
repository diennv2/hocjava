/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author DienNguyen
 * @date Dec 4, 2022
 * @version 1.0
*/

public class HocFinally {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            int a = 5;
            int b = 0;
            int c = a/b;
            System.out.println("c = " + c);
            System.out.println("Xin cám ơn!");
        } catch (Exception ex) {
            
            ex.printStackTrace();
        } finally {
            // TODO: handle finally clause
            System.out.println("Supprise");
        }
    }

}
