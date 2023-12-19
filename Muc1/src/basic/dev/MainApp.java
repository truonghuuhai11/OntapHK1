package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Mức 1. Bài 1:
		 */
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Nhập vào số nguyên a: ");
		int a = sc1.nextInt();
		System.out.println("Nhập vào số nguyên b: ");
		int b = sc1.nextInt();
		System.out.println("Nhập vào số nguyên c: ");
		int c = sc1.nextInt();

		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("a, b, c là 3 cạnh của 1 tam giác.");
		} else {
			System.out.println("a, b, c không phải là 3 cạnh của 1 tam giác.");
		}
		/**
		 * Mức 1. Bài 2:
		 */
		System.out.println("\n");

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Nhập vào cạnh a tam giác: ");
		double d = sc2.nextDouble();
		System.out.println("Nhập vào cạnh b tam giác: ");
		double e = sc2.nextDouble();
		System.out.println("Nhập vào cạnh c tam giác: ");
		double f = sc2.nextDouble();

		double chuvi = d + e + f;
		System.out.println("Chu vi tam giác là " + chuvi);
		double nuachuvi = chuvi / 2;
		double dientich = Math.sqrt(nuachuvi * (nuachuvi - d) * (nuachuvi - e) * (nuachuvi - f));
		System.out.println("Diện tích tam giác là " + dientich);
		/**
		 * Mức 1. Bài 3:
		 */
		System.out.println("\n");

		Scanner sc3 = new Scanner(System.in);

		System.out.println("Nhập vào đtb của sinh viên(đtb >= 0 && đtb <= 10): ");
		double dtb = sc3.nextDouble();

		if (dtb >= 8) {
			System.out.println("Học lực: loại Giỏi.");
		} else if (dtb >= 6.5) {
			System.out.println("Học lực: loại Khá.");
		} else {
			System.out.println("Học lực: loại Trung bình.");
		}
		/**
		 * Mức 1. Bài 4:
		 */
		System.out.println("\n");

		Scanner sc4 = new Scanner(System.in);

		int sochan = 0;
		int sole = 0;

		System.out.println("Nhập vào 4 số nguyên:");
		for (int i = 0; i < 4; i++) {
			System.out.println("Số nguyên thứ " + (i + 1) + ":");
			int g = sc4.nextInt();

			if (g % 2 == 0) {
				sochan++;
			} else {
				sole++;
			}
		}
		System.out.println("Số lượng số chẵn là: " + sochan);
		System.out.println("Số lượng số lẻ là: " + sole);
		/**
		 * Mức 1. Bài 5:
		 */
		System.out.println("\n");

		Scanner sc5 = new Scanner(System.in);

		System.out.println("Nhập số chữ điện tiêu dùng trong 1 tháng: ");
		int sochudien = sc5.nextInt();

		double giatien;
		if (sochudien <= 100) {
			giatien = sochudien * 1800;
		} else if (sochudien <= 200) {
			giatien = 100 * 1800 + (sochudien - 100) * 2500;
		} else {
			giatien = 100 * 1800 + 100 * 2500 + (sochudien - 200) * 3000;
		}

		System.out.println("Số tiền phải trả là: " + giatien + " VND");
	}
}