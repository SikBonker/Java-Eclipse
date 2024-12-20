package Buoi1;

import java.util.Scanner;

public class Bai6_KTsoNgto {
	public static boolean soNgto(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int s = sc.nextInt();

        if (soNgto(s)) {
            System.out.println(s + " là số nguyên tố.");
        } else {
            System.out.println(s + " không phải là số nguyên tố.");
        }
        System.out.println("Dạng nhị phân: " + Integer.toBinaryString(s));
        sc.close();
	}
}
