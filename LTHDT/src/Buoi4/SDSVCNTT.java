package Buoi4;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien can them: ");
		int n = sc.nextInt();
		SinhVienCNTT[] dscntt = new SinhVienCNTT[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Nhap thong tin cho sinh vien thu " + (i+1) + ": ");
			dscntt[i] = new SinhVienCNTT();
			dscntt[i].NhapTTSVCNTT();
		}
		
		System.out.println("Danh sach sinh vien CNTT: ");
		for(int i = 0;i<n;i++) {
			System.out.println("Thong tin cho sinh vien thu " + (i+1) + ": ");
			System.out.println(dscntt[i].toString());
		}
		sc.nextLine();
		 System.out.print("\nNhap dia chi email de tim tai khoan ELCIT: ");
	        String emailTimKiem = sc.nextLine();
	        boolean timThay = false;

	        for (int i = 0; i < n; i++) {
	            if (dscntt[i].getEmail().equalsIgnoreCase(emailTimKiem)) {
	                System.out.println("Tai khoan ELCIT cua sinh vien la: " + dscntt[i].getTaikhoan());
	                timThay = true;
	                break;
	            }
	        }

	        if (!timThay) {
	            System.out.println("Khong tim thay sinh vien voi email: " + emailTimKiem);
	        }

	        sc.close();
	}
}
