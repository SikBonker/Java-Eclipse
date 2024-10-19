package Buoi4;

import java.util.Random;
import java.util.Scanner;

public class NongTrai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Nhap so luong con vat:");
		int n = sc.nextInt();
		sc.nextLine();
		ConVat[] NongTrai = new ConVat[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap vao loai vat thu " + (i+1) + ": ");
			System.out.println("Nhap vao Giong: ");
			String Giong = sc.nextLine();

			System.out.println("Nhap vao mau long: ");
			String MauLong = sc.nextLine();

			System.out.println("Nhap vao can nang: ");
			double CanNang = sc.nextDouble();
			sc.nextLine();

			int loai = random.nextInt(3);
			if (loai == 0) {
				NongTrai[i] = new Bo(Giong, MauLong, CanNang);
			} else if (loai == 1) {
				NongTrai[i] = new Heo(Giong, MauLong, CanNang);
			} else {
				NongTrai[i] = new De(Giong, MauLong, CanNang);
			}
		}
		for (int i = 0; i < n; i++) {
			NongTrai[i].Keu();
		}
		sc.close();
	}
}
