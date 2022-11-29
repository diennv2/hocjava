import java.util.Scanner;

/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 2, 2022
 * @version 1.0
*/

public class TestSwitch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Mời bạn nhập vào một tháng bất kỳ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        switch (t) {
        case 1:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 2:
            System.out.println("Tháng " + t +" có 28 or 29 ngày");
            break;
        case 3:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 4:
            System.out.println("Tháng " + t +" có 30 ngày");
            break;
        case 5:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 6:
            System.out.println("Tháng " + t +" có 30 ngày");
            break;
        case 7:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 8:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 9:
            System.out.println("Tháng " + t +" có 30 ngày");
            break;
        case 10:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        case 11:
            System.out.println("Tháng " + t +" có 30 ngày");
            break;
        case 12:
            System.out.println("Tháng " + t +" có 31 ngày");
            break;
        default:
            System.err.println("bạn nhập sai tháng");
            break;
        }
    }

}
