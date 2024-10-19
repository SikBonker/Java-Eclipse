package Buoi5;

import java.util.Scanner;

import Buoi2.Date;

public class TheBus {
	private String maThe;
	private Date nph;
	private char loai;


	public void NhapThe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma the: ");
		maThe = sc.nextLine();

		System.out.println("Nhap vao ngay ma the: ");
		nph = new Date();
		nph.NhapDate();

		System.out.println("Nhap loai the (H: 1 gio, D: 24 gio, M: 1 thang, Y: 1 nam): ");
		loai = sc.nextLine().charAt(0);
	}

	public void InThe() {
		System.out.println("Ma the: " + maThe);
		System.out.println("Ngay phat hanh: ");
		nph.HienThiN();
		System.out.println("Loai the: " + loai);
	}

	public boolean LoaiTheMotNam() {
		return loai == 'Y';
	}

	public boolean PhatHanhTruocNgay(Date ngay) {
		if (this.nph.nam < ngay.getNam()) {
			return true;
		} else if (this.nph.nam == ngay.getNam()) {
			if (this.nph.thang < ngay.getThang())
				return true;
			else if (this.nph.thang == ngay.getThang()) {
				return this.nph.ngay < ngay.getNgay();
			}

		}
		return false;
	}
}
