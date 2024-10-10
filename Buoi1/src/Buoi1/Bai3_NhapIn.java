package Buoi1;

import java.util.Scanner;

public class Bai3_NhapIn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
        do {
            System.out.print("Nhập một ký tự: ");
            ch = sc.next().charAt(0);
            System.out.println("Bạn đã nhập: " + ch);
        } while (ch != 'q');
        sc.close();
	}
}
