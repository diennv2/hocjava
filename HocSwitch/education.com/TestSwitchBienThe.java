import java.util.Scanner;

/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 2, 2022
 * @version 1.0
 */

public class TestSwitchBienThe {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Mời bạn nhập vào một tháng bất kỳ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        switch (t) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("Tháng " + t + " có 31 ngày");
            break;
        case 2:
            System.out.println("Tháng " + t + " có 28 or 29 ngày");
            int y = new Scanner(System.in).nextInt();
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                System.out.println("y % 4 == 0 là " + (y % 4));
                System.out.println("y % 100 != 0 là " + (y % 100));
                System.out.println("y % 400 == 0 là " + (y % 400));
                System.out.println("Năm "+y +" là Năm Nhuần và có tháng " + t +"có 29 ngày");
            } else {
                System.out.println("Năm "+y +" là Năm không Nhuần và có tháng " + t +"có 28 ngày");
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Tháng " + t + " có 30 ngày");
            break;
        default:
            System.err.println("bạn nhập sai tháng");
            break;
        }
    }

}
