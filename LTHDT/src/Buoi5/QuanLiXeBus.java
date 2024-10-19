package Buoi5;

import java.util.Scanner;

import Buoi2.Date;

public class QuanLiXeBus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong khach hang");
		int n = sc.nextInt();
		sc.nextLine();

		KhachHang[] dsl = new KhachHang[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap vao khach hang thu " + (i + 1) + ": ");
			dsl[i] = new KhachHang();
			dsl[i].NhapTTKH();
		}
		
		System.out.println("Danh sach khach hang co loai the su dung nam:");
		for (int i = 0; i < n; i++) {
			if(dsl[i].TheSuDungNam()) {
				dsl[i].InTTKH();
			}
		}
		
		Date ngay = new Date(20, 5, 2022);
        System.out.println("\nDanh sach khach hang co the phat hanh truoc 20/05/2022:");
        for (int i = 0; i < n; i++) {
            if (dsl[i].ThePhatHanhTruoccNgay(ngay)) {
                dsl[i].InTTKH();
            }
        }
	}
}
