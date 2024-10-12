package Buoi2;

import java.util.Scanner;

class PhanSo {
	private int tu, mau;

	public PhanSo() {
		this.tu = 0;
		this.mau = 1;
	}

	public PhanSo(int tu, int mau) {
		if (mau == 0) {
			System.out.println("Mẫu số không thể bằng 0. Đặt mẫu số là 1.");
			this.mau = 1;
		} else {
			this.mau = mau;
		}
		this.tu = tu;
		this.RutGon();
	}

	private void RutGon() {
		int gcd = ucln(Math.abs(tu), Math.abs(mau));
		this.tu /= gcd;
		this.mau /= gcd;
		if (this.mau < 0) {
			this.tu = -this.tu;
			this.mau = -this.mau;
		}
	}

	private int ucln(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public void NhapPhanSo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu: ");
		this.tu = sc.nextInt();
		do {
			System.out.println("Nhap mau: ");
			this.mau = sc.nextInt();
			if (mau == 0) {
				System.out.println("Vui long nhap lai mau!");
			}
		} while (mau == 0);
		this.RutGon();
	}

	public void HienThiPhanSo() {
		if (tu == 0) {
			System.out.println("0");
		} else if (mau == 1) {
			System.out.println(tu);
		} else {
			System.out.println(tu + "/" + mau);
		}
	}

	public void NghichDao() {
		if (this.tu != 0) {
			int temp = this.tu;
			this.tu = this.mau;
			this.mau = temp;
		}
	}

	public PhanSo GiaTriNghichDao() {
		if (this.tu != 0) {
			return new PhanSo(this.mau, this.tu);
		}
		return null;
	}

	public double GiaTriThuc() {
		return (double) this.tu / this.mau;
	}

	public boolean lonHon(PhanSo a) {
		return this.tu * a.mau > this.mau * a.tu;
	}

	public PhanSo cong(PhanSo a) {
		int tuMoi = this.tu * a.mau + this.mau * a.tu;
		int mauMoi = this.mau * a.mau;
		return new PhanSo(tuMoi, mauMoi);
	}

	public PhanSo tru(PhanSo a) {
		int tuMoi = this.tu * a.mau - this.mau * a.tu;
		int mauMoi = this.mau * a.mau;
		return new PhanSo(tuMoi, mauMoi);
	}

	public PhanSo nhan(PhanSo a) {
		int tuMoi = this.tu * a.tu;
		int mauMoi = this.mau * a.mau;
		return new PhanSo(tuMoi, mauMoi);
	}

	public PhanSo chia(PhanSo a) {
		return new PhanSo(this.tu * a.mau, this.mau * a.tu);
	}

	public PhanSo cong(int x) {
		return this.cong(new PhanSo(x, 1));
	}

	public PhanSo tru(int x) {
		return this.tru(new PhanSo(x, 1));
	}

	public PhanSo nhan(int x) {
		return this.nhan(new PhanSo(x, 1));
	}

	public PhanSo chia(int x) {
		return this.chia(new PhanSo(x, 1));
	}

}
