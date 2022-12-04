/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author DienNguyen
 * @date Dec 4, 2022
 * @version 1.0
*/

public class HocThrow {

    public static void PtBac1 (int a, int b) throws Exception {
        try {
            System.out.println("x = "+ (-b/a));
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            PtBac1(0, 5);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
