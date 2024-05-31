package btsession01;

import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm Toán");
        float math = sc.nextFloat();
        System.out.println("Nhập vào điểm Văn");
        float van = sc.nextFloat();
        System.out.println("Nhập vào điểm Anh");
        float english = sc.nextFloat();
        float dtb = (math + van + english)/3;
        System.out.println("Điểm trung bình là : "+dtb);
    }
}
