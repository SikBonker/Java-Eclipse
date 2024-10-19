package Buoi5;
import Buoi5.TheBus;
import java.util.Scanner;

import Buoi2.Date;

public class KhachHang {
	private String ten;
	private boolean gtinh;	
	private int nsinh;
	private TheBus theBus;
	
	public void NhapTTKH() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten khach hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap gioi tinh (True: Nam, False: Nu): ");
		gtinh = sc.nextBoolean();
		System.out.println("Nhap nam sinh: ");
		nsinh = sc.nextInt();
		sc.nextLine();
		theBus = new TheBus();
		theBus.NhapThe();
	}
	public void InTTKH() {
		System.out.println("Ten khach hang: " + ten);
		if(gtinh == true) {
			System.out.println("Gioi tinh: Nam");
		}else {
			System.out.println("Gioi tinh: Nu");
		}
		System.out.println("Nam sinh: " + nsinh);
		theBus.InThe();
	}
	public boolean TheSuDungNam() {
        return theBus.LoaiTheMotNam();
    }

    public boolean ThePhatHanhTruoccNgay(Date date) {
        return theBus.PhatHanhTruocNgay(date);
    }
}
