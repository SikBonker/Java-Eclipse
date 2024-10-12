package Buoi2;

import java.util.Scanner;

class Date {
	private int ngay, thang, nam;

	public Date() {
		this.ngay = 1;
		this.thang = 1;
		this.nam = 2000;
	}

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	public void HienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	private int ngayTrongThang() { // Kiem tra tinh hop le
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) {
				return 29; // Nam nhuan
			} else {
				return 28; // Không nhuan
			}
		default:
			return 0;
		}
	}

	public boolean HopLe() {
		if (thang < 1 || thang > 12)
			return false;
		if (ngay < 1 || ngay > ngayTrongThang())
			return false;
		return true;
	}

	public void NhapDate() {
		Scanner sc = new Scanner(System.in); //k su dung sc.close
		do {
			System.out.print("Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang: ");
			thang = sc.nextInt();
			System.out.print("Nhap nam: ");
			nam = sc.nextInt();
			if(!HopLe()) {
				System.out.println("Ngay Thang Nam khong hop le, vui long nhap lai");
			}
		}while(!HopLe());
	}
	public Date NgayHomSau() {
		int ngayMoi = ngay + 1;
		int thangMoi = thang;
		int namMoi = nam;
		if(ngayMoi > ngayTrongThang()) {
			ngayMoi = 1;
			thangMoi++;
			if(thangMoi > 12) {
				thangMoi = 1;
				namMoi++;
			}
		}
		return new Date(ngayMoi,thangMoi,namMoi);
	}
	public Date CongNgay(int n) {
		Date kq = new Date(this.ngay,this.thang,this.nam);
		for(int i = 0; i < n; i++) {
			kq = kq.NgayHomSau();
		}
		return kq;
	}
}
