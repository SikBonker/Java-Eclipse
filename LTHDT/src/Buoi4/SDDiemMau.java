package Buoi4;

import java.util.Scanner;

public class SDDiemMau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiemMau A = new DiemMau(5,10,"Trang");
		System.out.println("Thong tin Diem A: ");
		A.HienThiMau();
		
		DiemMau B = new DiemMau(0, 0, null);
		System.out.println("Nhap toa do diem B: ");
		B.nhapDiem();
		B.DoiDiem(10, 8);
		System.out.println("Toa do diem B: ");
		B.HienThi();
		B.GanMau("Vang");
		B.HienThiMau();
	}
}
