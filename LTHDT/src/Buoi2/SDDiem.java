package Buoi2;

import Buoi2.Diem;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do diem A ");
		A.HienThi();
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("Toa do diem B ");
		B.HienThi();
		Diem C = new Diem(-B.GiaTriX(),-B.GiaTriY());
		System.out.print("Toa do diem C ");
		C.HienThi();
		System.out.println("Toa do tu diem B den tam O: " + B.KhoangCach());
		System.out.println("Toa do tu diem A den diem B: " + A.KhoangCach(B));
	}
}
