package Buoi3;

import java.util.Scanner;

import Buoi3.Diem;

public class DoanThang {
	private Diem d1;
	private Diem d2;

	public DoanThang() {
		this.d1 = new Diem();
		this.d2 = new Diem();
	}

	public DoanThang(Diem d1, Diem d2) {
		this.d1 = d1;
		this.d2 = d2;
	}

	public DoanThang(int ax, int ay, int bx, int by) {
		this.d1 = new Diem(ax, ay);
		this.d2 = new Diem(bx, by);
	}

	public void NhapToaDo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do diem d1: ");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();
		d1.setX(x1);
		d1.setY(y1);

		System.out.println("Nhap toa do diem d2: ");
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();
		d2.setX(x2);
		d2.setY(y2);
	}
	
	public void HienThiDoanThang() {
		System.out.print("d1");
		d1.HienThiDiem();
		System.out.print("d2");
		d2.HienThiDiem();
	}
	
	public void TinhTien(int dx, int dy) {
		d1.setX(d1.getX() + dx);
		d1.setY(d1.getY() + dy);
		d2.setX(d2.getX() + dx);
		d2.setY(d2.getY() + dy);
	}
	
	public double DoDaiDoanThang() { //pow(x,y): x^y
        return Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + Math.pow(d2.getY() - d1.getY(), 2));

	}
}
