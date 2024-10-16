package Buoi4;

import Buoi2.Diem;

public class DiemMau extends Diem{
	String Mau;

	public DiemMau(int x, int y, String Mau) {
		super(x,y);
		this.Mau = Mau;
	}

	public void GanMau(String Mau) {
		this.Mau = Mau;
	}

	public void HienThiMau() {
		System.out.println("Toa do diem (" + x + ", " + y + ")" + Mau);
	}
}
