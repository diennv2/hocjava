/**
 * (C) Copyright 2022 Dien Nguyen. All Rights Reserved.
 *
 * @author Admin
 * @date Jun 14, 2022
 * @version 1.0
*/

package education.com;

import java.util.Scanner;

public class KTChuoiChan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int temp,temp1, digit, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một dãy số bất kỳ:");
        
        int num = sc.nextInt();
        temp1=num;
        temp = num;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            if (digit%2!=0) {
                System.out.println("Dãy số " + temp1 +" Không phải dãy số chẵn");
                System.exit(0);
            }
            temp = temp / 10;
            count--;
        }
        System.out.println("Dãy số " + temp1 + " là dãy số chẵn");
    }

}
