package Buoi3;

class Diem {
	private int x;
	private int y;

	public Diem() {
		this.x = 0;
		this.y = 0;
	}

	public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// Setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void HienThiDiem() {
		System.out.println("(" + x + ", " + y + ")");
	}
}