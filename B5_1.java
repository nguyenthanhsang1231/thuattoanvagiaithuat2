package BaiTap5_10;

import java.util.Scanner;

public class B5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so bat ki");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * ( i + 1 );
        }
        System.out.println(sum);
    }
}
