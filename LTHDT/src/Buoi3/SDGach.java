package Buoi3;

import java.util.Scanner;
import Buoi3.Gach;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong loai gach: ");
		int n = sc.nextInt();
		Gach[] dsg = new Gach[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap loai gach thu " + i);
			dsg[i] = new Gach();
			dsg[i].NhapGach();
		}
		
		System.out.println("Danh sach gach vua nhap: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Loai gach thu " + i);
			dsg[i].HienThiGach();
		}
		
		int j = 0;
		float ChiPhiThapNhat = dsg[0].Gia() / (float) dsg[0].DienTichLotToiDa();
		for(int i = 0; i < n; i++) {
			float ChiPhi = dsg[i].Gia() / (float) dsg[i].DienTichLotToiDa();
			if(ChiPhi < ChiPhiThapNhat) {
				j = i;
				ChiPhiThapNhat = ChiPhi;
			}
		}
		System.out.println("Loai Gach co chi phi thap nhat: ");
		dsg[j].HienThiGach();
		
		int CDN = 500;
		int CNN = 1500;
		System.out.println("Chi phi mua Gach de lot nen dien tich 500x1500:");
		for(int i = 0; i < n;i ++) {
			int SoHop = dsg[i].SolgGachLotNen(CDN, CNN);
			long ChiPhi = SoHop * dsg[i].Gia();
			System.out.println("Loai gach thu " + i + ": " + ChiPhi);
		}
	}
}
