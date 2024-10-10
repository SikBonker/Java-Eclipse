package Buoi1;

import java.util.Scanner;

public class Bai4_TinhTong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		boolean check = false;
		while (!check) {
			try {
				System.out.println("Nhập số nguyên a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Nhập số nguyên b: ");
				b = Integer.parseInt(sc.nextLine());
				check = true;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại");
			}
		}
		System.out.println("Tổng: " + (a + b));
		sc.close();
	}
}
