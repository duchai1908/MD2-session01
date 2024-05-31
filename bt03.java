package btsession01;

import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài");
        int chieuDai = sc.nextInt();
        System.out.println("Nhập vào chiều rộng");
        int chieuRong = sc.nextInt();
        int chuVi = (chieuDai + chieuRong)*2;
        int dienTich = chieuDai * chieuRong;
        System.out.println("chu vi: "+chuVi);
        System.out.println("dien tich: "+dienTich);

    }
}
