package Buoi2;

import java.util.Scanner;

class Diem {
	private int x, y;

	public Diem() {
		this.x = 0;
		this.y = 0;
	}

	public Diem(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do x: ");
		this.x = sc.nextInt();
		System.out.print("Nhap toa do y: ");
		this.y = sc.nextInt();
		sc.close();
	}

	public void HienThi() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}

	public void DoiDiem(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int GiaTriX() {
		return this.x;
	}

	public int GiaTriY() {
		return this.y;
	}

	public float KhoangCach() {
		return (float) Math.sqrt(x * x + y * y);
	}

	public float KhoangCach(Diem d) {
		int dx = this.x - d.x;
		int dy = this.y - d.y;
		return (float) Math.sqrt(dx * dx + dy * dy);
	}
}
