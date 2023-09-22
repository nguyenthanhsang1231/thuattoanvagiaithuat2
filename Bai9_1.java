package BaiTap5_10;

public class Bai9_1 {
    public static void main(String[] args) {
        int i, j, k;
        for ( i = 0; i <= 20; i++) {
            for ( j = 0; j <= 10 ; j++) {
                for ( k = 0; k < 4; k++) {
if (i * 1000 + j * 2000 + k * 5000 == 20000) {
    System.out.println("den 1000 " + i + " ,den 2000 " + j + " ,vi the 5000 " + k);
}
                }
            }
        }
    }
}
