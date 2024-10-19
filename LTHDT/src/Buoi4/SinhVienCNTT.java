package Buoi4;

import java.util.Scanner;

import Buoi2.Date;
import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String taikhoan, matkhau, email;

	public SinhVienCNTT() {
		super();
		this.taikhoan = "";
		this.matkhau = "";
		this.email = "";
	}

	public SinhVienCNTT(String MSSV, String HoTen, Date NgaySinh, int SlgHPDK, String[] TenHPDK, String[] DiemHP,
			String taikhoan, String matkhau, String email) {
		super(MSSV, HoTen, NgaySinh, SlgHPDK, TenHPDK, DiemHP);
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.email = email;
	}
	
	public String getTaikhoan() {
		return this.taikhoan;
	}
	public void NhapTTSVCNTT() {
		Scanner sc = new Scanner(System.in);
		super.NhapTTSinhVien();
		System.out.print("Nhap tai khoan ELCIT: ");
		this.taikhoan = sc.nextLine();
		
		System.out.print("Nhap mat khau: ");
		this.matkhau = sc.nextLine();
		
		System.out.print("Nhap email sinh vien: ");
		this.email = sc.nextLine();
	}
	
	public void doiMatKhau(String newpass) {
        this.matkhau = newpass;
        System.out.println("Mat khau da duoc thay doi thanh cong.");
    }
	
	public String getEmail() {
        return this.email;
    }
	
	public String toString() {
        String s = super.toString();
        s += "\nTai khoan ELCIT: " + taikhoan
        		+ "\nMat khau: " + matkhau
                + "\nEmail: " + email;
        return s;
    }
}
