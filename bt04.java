package btsession01;

import java.util.Scanner;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a");
        int a = sc.nextInt();
        System.out.println("Số bình phương là: " + Math.pow(a,2));
        System.out.println("Số lập phương là: " + Math.pow(a,3));
    }
}
