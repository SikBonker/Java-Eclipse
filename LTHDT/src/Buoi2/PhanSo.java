package Buoi2;

import java.util.Scanner;

class PhanSo {
	private int tu,mau;
	
	public PhanSo() {
		this.tu = 0;
		this.mau = 0;
	}
	
	public PhanSo(int tu, int mau) {
        this.tu = tu;
        setMau(mau);
    }
	
	public void setMau(int mau) {
        if (mau == 0) {
            throw new ArithmeticException("Mau so phai khac 0.");
        }
        this.mau = mau;
    }
	
	public void NhapPhanSo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu");
		this.tu = sc.nextInt();
		do {
			System.out.println("Nhap tu");
			this.mau = sc.nextInt();
			if(mau == 0) {
				System.out.println("Vui long nhap lai mau!");
			}
		}while(mau == 0);
	}
}
