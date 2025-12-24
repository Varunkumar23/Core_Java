package arrayProblems;

import java.util.Scanner;

public class dynamicInitialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the size of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		System.out.println("Please enter the elements into the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("The elements you are entered into the array is: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
