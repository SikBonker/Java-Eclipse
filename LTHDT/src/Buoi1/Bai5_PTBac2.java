package Buoi1;

import java.util.Scanner;

public class Bai5_PTBac2 {
	public static void TinhNghiem(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
		} else {
			System.out.println("Phương trình có hai nghiệm: ");
			System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
			System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		boolean check = false;
		while (!check) {
			try {
				System.out.print("Nhập a: ");
				a = Double.parseDouble(sc.nextLine());
				System.out.print("Nhập b: ");
				b = Double.parseDouble(sc.nextLine());
				System.out.print("Nhập c: ");
				c = Double.parseDouble(sc.nextLine());
				check = true;
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập lại");
			}
		}
		TinhNghiem(a, b, c);
		sc.close();
	}
}
