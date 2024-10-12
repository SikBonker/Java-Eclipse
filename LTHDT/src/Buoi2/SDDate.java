package Buoi2;

import java.util.Scanner;

import Buoi2.Date;

public class SDDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date NgayMacDinh = new Date();
		System.out.print("Ngay mac dinh: ");
		NgayMacDinh.HienThi();
		
		Date Ngay = new Date();
		Ngay.NhapDate();
		System.out.print("Ngay da nhap: ");
		Ngay.HienThi();
		
		Date HomSau = Ngay.NgayHomSau();
		System.out.print("Ngay hom sau: ");
		HomSau.HienThi();
		
		System.out.print("Nhap so ngay can cong: ");
        int soNgayCong = sc.nextInt();
        
        Date CongNgay = Ngay.CongNgay(soNgayCong);
        System.out.print("Ngay sau khi cong " + soNgayCong + " ngay: ");
        CongNgay.HienThi();
        sc.close();
	}
}
