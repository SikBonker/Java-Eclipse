package Buoi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai8_Danhsach {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // Nhập danh sách các số nguyên
        System.out.println("Nhập số lượng phần tử trong danh sách: ");
        int n = sc.nextInt();
        
        System.out.println("Nhập các số nguyên: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Số thứ " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        // Nhập số nguyên x cần đếm
        System.out.print("Nhập số nguyên x cần đếm: ");
        int x = sc.nextInt();
        
        // Đếm số lần xuất hiện của x
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của " + x + ": " + count);
        
        // Sắp xếp danh sách theo thứ tự tăng dần
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    // Hoán đổi các phần tử
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        
        // Hiển thị danh sách đã sắp xếp
        System.out.println("Danh sách sau khi sắp xếp: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        sc.close();
    }
}
