package Buoi1;

import java.util.Scanner;

public class Bai7_TachvaHienthiten {
	public static String TachTen(String HoTen) {
        String[] s = HoTen.split(" ");
        return s[s.length - 1];
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        String Hoten = sc.nextLine();
        System.out.println("Chào bạn " + TachTen(Hoten));
        sc.close();
	}
}
