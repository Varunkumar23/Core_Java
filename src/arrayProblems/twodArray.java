package arrayProblems;

import java.util.Scanner;

public class twodArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter the No.of columns: ");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		System.out.println("Enter the elements into the 2D array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements you are entered into the 2D array: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
