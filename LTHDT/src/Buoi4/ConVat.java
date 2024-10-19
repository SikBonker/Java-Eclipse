package Buoi4;

public class ConVat {
	private String Giong, MauLong;
	private double CanNang;

	public ConVat() {
		this.Giong = "";
		this.MauLong = "";
		this.CanNang = 0;
	}

	public ConVat(String Giong, String MauLong, double CanNang) {
		this.Giong = Giong;
		this.MauLong = MauLong;
		this.CanNang = CanNang;
	}

	public void Keu() {
		System.out.println("Giong: " + Giong);
		System.out.println("Mau Long: " + MauLong);
		System.out.println("CanNang: " + CanNang);
	}

}
