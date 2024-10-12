package Buoi1;

import java.util.Scanner;

public class Bai8_Danhsach {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong danh sach: ");
        int n = sc.nextInt();
        int[] danhSach = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            danhSach[i] = sc.nextInt();
        }

        System.out.print("Nhap so nguyen x: ");
        int x = sc.nextInt();

        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (danhSach[i] == x) {
                dem++;
            }
        }
        System.out.println("So " + x + " xuat hien " + dem + " lan trong danh sach.");
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (danhSach[j] > danhSach[j + 1]) {
                    int temp = danhSach[j];
                    danhSach[j] = danhSach[j + 1];
                    danhSach[j + 1] = temp;
                }
            }
        }

        System.out.println("Danh sach sau khi sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(danhSach[i] + " ");
        }
        System.out.print(" ");
    }
}
