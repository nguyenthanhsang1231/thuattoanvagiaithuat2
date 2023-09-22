package BaiTap5_10;

public class Bai6_3 {
    public static void main(String[] args) {
        int a = 234;
        int b = 192;
        int soDu = a % b;
        while (soDu != 0) {
            a = b;
            b = soDu;
            soDu = a % b;
        }
        System.out.println("uoc chung lon nhat : " + b);
    }
}
