package BaiTap5_10;

import java.util.Scanner;

public class B6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki");
        double n = sc.nextDouble();
        System.out.println("uoc");
        for (double i = 0; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("boi");
        for (double i = 100; i >= n; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}
