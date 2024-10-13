package Buoi3;

import java.util.Scanner;

public class Gach {
	private String MaSo, Mau;
	private int SolgVien, CD, CN;
	private long Gia;
	
	public long Gia() {
		return Gia;
	}
	public Gach() {
		this.MaSo = "";
		this.Mau = "";
		this.SolgVien = 0;
		this.CD = 0;
		this.CN = 0;
		this.Gia = 0;
	}

	public Gach(String MaSo, String Mau, int SolgVien, int CD, int CN, long Gia) {
		this.MaSo = MaSo;
		this.Mau = Mau;
		this.SolgVien = SolgVien;
		this.CD = CD;
		this.CN = CN;
		this.Gia = Gia;
	}

	public Gach(Gach other) {
		this.MaSo = other.MaSo;
		this.Mau = other.Mau;
		this.SolgVien = other.SolgVien;
		this.CD = other.CD;
		this.CN = other.CN;
		this.Gia = other.Gia;
	}

	public void NhapGach() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so gach: ");
		this.MaSo = sc.nextLine();
		System.out.print("Nhap mau gach: ");
		this.Mau = sc.nextLine();
		System.out.print("Nhap so luong vien co trong 1 hop: ");
		this.SolgVien = sc.nextInt();
		System.out.print("Nhap chieu dai: ");
		this.CD = sc.nextInt();
		System.out.print("Nhap chieu ngang: ");
		this.CN = sc.nextInt();
		System.out.print("Nhap gia 1 hop: ");
		this.Gia = sc.nextLong();
	}

	public void HienThiGach() {
		System.out.println("Ma so: " + MaSo);
		System.out.println("Mau: " + Mau);
		System.out.println("So luong vien trong hop: " + SolgVien);
		System.out.println("Chieu dai: " + CD);
		System.out.println("Chieu ngang: " + CN);
		System.out.println("Gia 1 hop: " + Gia);
	}
	
	public float GiaBanLe() {
		return (Gia / (float) SolgVien) * 1.2f;
	}
	
	public int DienTichLotToiDa() {
		return SolgVien * CD * CN;
	}
	
	public int SolgGachLotNen(int CDNen, int CNNen) {
	    int DienTichNen = CDNen * CNNen;
	    int DienTichGach = CD * CN;
	    int DienTichLotToiDa = SolgVien * DienTichGach;
	    return (int) Math.ceil(DienTichNen / (double) DienTichLotToiDa);
	}
}
