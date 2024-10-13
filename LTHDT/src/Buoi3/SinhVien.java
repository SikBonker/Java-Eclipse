package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String MSSV, HoTen;
	private Date NgaySinh;
	private int SlgHPDK;
	private String[] TenHPDK;
	private String[] DiemHP;

	public SinhVien() {
		this.TenHPDK = new String[100];
		this.DiemHP = new String[100];
		this.SlgHPDK = 0;
	}

	public SinhVien(String MSSV, String HoTen, Date NgaySinh, int SlgHPDK, String[] TenHPDL, String[] DiemHP) {
		this.MSSV = MSSV;
		this.HoTen = HoTen;
		this.NgaySinh = NgaySinh;
		this.SlgHPDK = SlgHPDK;
		this.TenHPDK = TenHPDL;
		this.DiemHP = DiemHP;
	}
	
	public String getMSSV() {
		return this.MSSV;
	}
	
	public String getHoTen() {
		return this.HoTen;
	}

	public void NhapTTSinhVien() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		this.MSSV = sc.nextLine();
		
		System.out.print("Nhap ho ten: ");
		this.HoTen = sc.nextLine();
		
		System.out.println("Nhap ngay sinh: ");
		this.NgaySinh = new Date();
		this.NgaySinh.NhapDate();
		
		System.out.print("Nhap so luong hoc phan dang ky: ");
		this.SlgHPDK = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < SlgHPDK; i++) {
			System.out.println("Nhap ten hoc phan thu " + (i + 1));
			this.TenHPDK[i] = sc.nextLine();
		}
	}

	public void NhapDiemHP() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < SlgHPDK; i++) {
			System.out.print("Nhap diem cho hoc phan " + TenHPDK[i] + ": ");
			this.DiemHP[i] = sc.nextLine();
		}
	}

	public double TinhDiemTB() {
		double Tong = 0;
		for (int i = 0; i < SlgHPDK; i++) {
			Tong += chuyenDiem(DiemHP[i]);
		}
		return Tong / SlgHPDK;
	}

	public double chuyenDiem(String diemChu) {
		switch (diemChu) {
		case "A":
			return 4.0;
		case "B+":
			return 3.5;
		case "B":
			return 3.0;
		case "C+":
			return 2.5;
		case "C":
			return 2.0;
		case "D+":
			return 1.5;
		case "D":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return 0.0;
		}
	}

	public void DKHP(String HP) {
		this.TenHPDK[SlgHPDK] = HP;
		this.SlgHPDK++;
	}

	public void XoaHP(String HP) {
		int DelI = -1;
		for (int i = 0; i < SlgHPDK - 1; i++) {
			if (TenHPDK[i].equals(HP)) {
				DelI = i;
				break;
			}
		}
		if (DelI != -1) {
			for (int i = DelI; i < SlgHPDK; i++) {
				TenHPDK[i] = TenHPDK[i + 1];
				DiemHP[i] = DiemHP[i + 1];
			}
			TenHPDK[SlgHPDK - 1] = null;
			DiemHP[SlgHPDK - 1] = null;
		} else {
			System.out.println("Hoc phan khong ton tai!");
		}
	}

	public String toString() {
		String s = "MSSV: " + MSSV 
				+ "\nHo Ten: " + HoTen 
				+ "\nNgay Sinh: " + NgaySinh.HienThiN()
				+ "\nSo luong hoc phan: "+ SlgHPDK 
				+ "\nDanh sach hoc phan dang ky";
		for (int i = 0; i < SlgHPDK; i++) {
			s += "\n- " + TenHPDK[i] + ": " + DiemHP[i];
		}
		return s;
	}
}
