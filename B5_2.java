package BaiTap5_10;

import java.util.Scanner;

public class B5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki");
        double n = sc.nextDouble();
        double sum = 0;
        for (double i = 0; i < n; i++) {
            sum += (2*i+1) / (2* i +2);
        }
        System.out.println(sum);
    }
}
