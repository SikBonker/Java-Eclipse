package Buoi2;

import java.util.Scanner;
import Buoi2.PhanSo;

public class SDPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3, 4);
		PhanSo b = new PhanSo(4, 9);
		System.out.print("Phan so a: ");
		a.HienThiPhanSo();
		System.out.print("Phan so b: ");
		b.HienThiPhanSo();

		PhanSo x = new PhanSo();
		System.out.println("Nhap phan so x: ");
		x.NhapPhanSo();
		PhanSo y = new PhanSo();
		System.out.println("Nhap phan so y: ");
		y.NhapPhanSo();
		PhanSo NghichDaoX = x.GiaTriNghichDao();
		NghichDaoX.HienThiPhanSo();

		PhanSo TongXY = x.cong(y);
		System.out.println("Tong cua x va y: ");
		TongXY.HienThiPhanSo();

		System.out.println("Nhap so luong phan so: ");
		int n = sc.nextInt();
		PhanSo[] dsps = new PhanSo[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phân số thứ " + (i + 1) + ":");
			dsps[i] = new PhanSo();
			dsps[i].NhapPhanSo();
		}
		
		PhanSo tongPS =  new PhanSo();
		for (int i = 0; i < n; i++) {
			tongPS = tongPS.cong(dsps[i]);
		}
		System.out.println("Tong cac phan so: ");
		tongPS.HienThiPhanSo();
		
		PhanSo maxPhanSo = dsps[0];
		for (int i = 1; i < n; i++) {
		    if (dsps[i].lonHon(maxPhanSo)) {
		        maxPhanSo = dsps[i];
		    }
		}
		System.out.println("Phan so lon nhat: ");
		maxPhanSo.HienThiPhanSo();
		
		for (int i = 0; i < n - 1; i++) {
		    for (int j = 0; j < n - 1 - i; j++) {
		        if (dsps[j].lonHon(dsps[j + 1])) {
		            PhanSo temp = dsps[j];
		            dsps[j] = dsps[j + 1];
		            dsps[j + 1] = temp;
		        }
		    }
		}
		System.out.println("Danh sách phân số sau khi sắp xếp:");
		for (int i = 0; i < n; i++) {
		    dsps[i].HienThiPhanSo();
		}
		
	}
}
