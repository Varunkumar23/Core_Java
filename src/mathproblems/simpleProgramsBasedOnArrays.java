package mathproblems;

public class simpleProgramsBasedOnArrays {

	public static void main(String[] args) {

//		int num = 123;

//1    
//		int count = 0;
//		int sum3 = num;
//		while (sum3 > 0) {
//			int digit = sum3 % 10;
//			count += 1;
//
//			sum3 /= 10;
//		}
//
//		System.out.println(count);

//2
//		int sum = 0;
//		int sum1 = num;
//		while (sum1 > 0) {
//			int digit = sum1 % 10;
//			sum += digit;
//
//			sum1 /= 10;
//		}
//
//		System.out.println(sum);

//3
//		int pro = 1;
//		int sum2 = num;
//
//		while (sum2 > 0) {
//			int digit = sum2 % 10;
//			pro *= digit;
//
//			sum2 /= 10;
//		}
//		System.out.println(pro);

//4

//		if (sum == pro) {
//			System.out.println("Num 123 is a spy Number");
//		}

		// 5

//		for (int i = 0; i < 10; i++) {
//			int count = 0;
//
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					count++;
//				}
//			}
//
//			if (count == 2)
//				System.out.println(i + " is Prime");
//			else
//				System.out.println(i + " is Not Prime");
//		}

		// 6

//		for (int i = 1; i <= 6; i++) {
//			if (6 % i == 0) {
//				System.out.print(i + " ");
//			}
//		}

		// 7
//		for (int i = 1; i <= 5; i++) {
//			System.out.print("Factors of " + i + ": ");
//
//			for (int j = 1; j <= i; j++) {
//				if (i % j == 0) {
//					System.out.print(j + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
//8
//		int n=5;
//		int fact=1;
//		while(n>0) {
//			fact*=n;
//			n-=1;
//		}
//		System.out.println("Factorial of 5 is: "+fact);
		
		
//int n=145;
//
//while(n>0) {
//	int fact=1;
//	int num=n%10;
//	int digit=n%10;
//	while(digit>0) {
//		fact*=digit;
//		digit-=1;
//		
//	}
//	n/=10;
//	System.out.println("Factorial of digit "+num+" is : "+fact);
//	
//}


//int n=145;
//
//int sum=0;
//while(n>0) {
//	int fact=1;
//	int digit=n%10;
//	while(digit>0) {
//		fact*=digit;
//		digit-=1;
//		
//	}
//	sum+=fact;
//	n/=10;
//	
//}
//if(sum==145) {
//	
//	System.out.println("The given number is a sunny digit");
//}
		

		
		int n=9;
		int num=n;
		int sum = 0;  0
 		while (n > 0) {
			int digit = n % 10;
			sum += digit;

			n /= 10;
		}

		System.out.println(sum);
		
		if(sum==num) {
			System.out.println("The given number is a neon number");
		}






		
		
		
		

		

	}

}
