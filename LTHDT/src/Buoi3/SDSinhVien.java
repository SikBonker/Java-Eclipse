package Buoi3;

import java.util.Scanner;
import Buoi3.SinhVien;

public class SDSinhVien {
	public static String LayTen(String HoTen) {
		String[] parts = HoTen.split(" ");
		return parts[parts.length - 1];
	}

	public static void SortTen(int SlgSV,SinhVien[] dssv) {
		for (int i = 0; i < SlgSV; i++) {
			int minI = i;
			for (int j = i + 1; j < SlgSV; j++) {
				String tenCuoi1 = LayTen(dssv[minI].getHoTen());
				String tenCuoi2 = LayTen(dssv[j].getHoTen());

				if (tenCuoi2.compareTo(tenCuoi1) < 0) {
					minI = j;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		SinhVien a = new SinhVien();
//		a.NhapTTSinhVien();
//		a.DKHP("LTHDT");
		
		System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
		
		SinhVien[] dssv = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
			dssv[i] = new SinhVien();
			dssv[i].NhapTTSinhVien();
			dssv[i].NhapDiemHP();
		}

		System.out.println("Sinh Vien bi canh cao hoc vu:");
		for (int i = 0; i < n; i++) {
			if(dssv[i].TinhDiemTB() < 2.0) {
				System.out.println(dssv[i].toString()); 
			}
		}
		
		SinhVien best = dssv[0];
		for (int i = 0; i < n; i++) {
			if(dssv[i].TinhDiemTB() > best.TinhDiemTB()) {
				best = dssv[i];
			}
		}
		System.out.println("Sinh vien co diem trung binh cao nhat: ");
		System.out.println(best.toString());
		
		System.out.println("Danh sach sinh vien theo alphabet: ");
		SortTen(n, dssv);
		for (int i = 0; i < n; i++) {
			System.out.println(dssv[i].toString());
		}
	}
}
