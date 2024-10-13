package Buoi3;

import java.text.DecimalFormat;

import Buoi3.Diem;
import Buoi3.DoanThang;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		System.out.print("Toa do Diem A");
		A.HienThiDiem();
		System.out.print("Toa do Diem B");
		B.HienThiDiem();
		
		DoanThang AB = new DoanThang(A,B);
		System.out.println("Toa do doan thang AB");
		AB.HienThiDoanThang();
		System.out.println("Tinh Tinh AB di doan (5,3)");
		AB.TinhTien(5, 3);
		AB.HienThiDoanThang();
//		double dodai = AB.DoDaiDoanThang();
//		DecimalFormat df = new DecimalFormat("#.##");
//		System.out.println("Do dai doan AB: " + df.format(dodai));
		
		DoanThang CD = new DoanThang();
		CD.NhapToaDo();
		System.out.println("Toa do doan thang CD");
		CD.HienThiDoanThang();
	}
}
