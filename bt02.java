package btsession01;

import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Nhập vào số tiền USD: ");
        int priceUSD = sc.nextInt();
        int total = priceUSD * rate;
        System.out.println("Số tiền sau chuyển đổi là: "+total);
    }
}
