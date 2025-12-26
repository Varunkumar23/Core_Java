package arrayProblems;

public class arrayAssignment {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int n = arr.length;

//1
//		for(int i=0;i<n;i++) {
//			if(arr[i]%5==0) {
//				System.out.println(arr[i]);
//			}
//		}
//
//	}

//2

//		for (int i = 0; i < n; i++) {
//
//			System.out.println(arr[i]);
//			i++;
//
//		}

//3
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2==0) {
//				System.out.println(arr[i]);
//			}
//		}

//4
//		for(int i=0;i<n;i++) {
//			if(i%2!=0) {
//				System.out.println(arr[i]);
//			}
//		}
//		

//5
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2!=0) {
//				System.out.println(arr[i]);
//			}
//		}

//6
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2==0 && arr[i]>0) {
//				System.out.println(arr[i]);
//			}
//		}

//7

//		System.out.println(arr[0]);
//		System.out.println(arr[n-1]);

//8
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=arr[i];
//			
//		}
//		System.out.println(sum);

//9

//		int sum=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2==0) {
//				sum+=arr[i];
//			}
//		}
//	System.out.println(sum);

//10
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2!=0) {
//				sum+=arr[i];
//			}
//		}
//	System.out.println(sum);

//11

//		int sum=0;
//		int count=0;
//		for(int i=0;i<n;i++) {
//			
//				sum+=arr[i];
//				count++;
//		}
//	System.out.println(sum/count);

//12
//		int sum=0;
//		int count=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2==0) {
//				sum+=arr[i];
//				count++;
//			}
//		}
//	System.out.println(sum/count);

//13

//		int even=0;
//		int odd=0;
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]%2==0) {
//				even+=arr[i];
//			}else {
//				odd+=arr[i];
//			}
//		}
//	System.out.println(even-odd);

//14
//	int[] temp= {153,345,456};	
//		for(int i=0;i<temp.length;i++) {
//			if(armStrongNumber(temp[i])) {
//				System.out.println(temp[i]+" is a armstrong number");
//			}else {
//				System.out.println(temp[i]+" is not a armstrong number");
//
//			}
//			
//		}

//15

//		int[] newArr = { 121, 323, 454, 676, 123, 456 };
//		for (int i = 0; i < newArr.length; i++) {
//			if (isPalindrome(newArr[i])) {
//				System.out.println(newArr[i] + " is a Palindrome");
//			} else {
//				System.out.println(newArr[i] + " is a not Palindrome");
//
//			}
//		}

//16

//		for(int i=1;i<n;i++) {
//			int num=arr[i];
//			int count=0;
//			for(int j=2;j<=num;j++) {
//				if(num%j==0) {
//					count++;
//				}
//			}
//			if(count<2) {
//				System.out.println(arr[i]);
//			}
//		}

//17

//		int i = 0;
//		int j = arr.length - 1;
//		boolean isPalin=true;
//		while (i < j) {
//			if (arr[i] != arr[j]) {
//				isPalin=false;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if(isPalin) {
//			System.out.println("Array is a palindrome");
//		}else {
//			System.out.println("Array is not a palindrome");
//
//		}

//18

//		int[] temp=new int[n];
//		for(int i=0;i<n;i++) {
//			temp[i]=arr[i];
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(temp[i]+" ");
//		}

//19

//		int[] temp=new int[2];
//		temp[0]=100;
//		temp[1]=200;
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i]);
//		}

//20

//		int[] arr1= {1,2,3};
//		int[] arr2= {4,5,6};
//		int size=arr1.length+arr2.length;
//		int[] newArr=new int[size];
//		for(int i=0;i<arr1.length;i++) {
//			newArr[i]=arr1[i];
//			newArr[i+3]=arr2[i];
//
//			
//		}
//		for(int i=0;i<size;i++) {
//			System.out.println(newArr[i]);
//		}

//21
//		int[] reverseArr = { 1,2,3,4,5,6,7,8,9,10 };
//
//		int i=0;
//		int j=reverseArr.length-1;
//		while(i<j) {
//			int temp=reverseArr[i];
//			reverseArr[i]=reverseArr[j];
//			reverseArr[j]=temp;
//			i++;
//			j--;
//			
//		}
//		
//		for(int k=0;k<reverseArr.length;k++) {
//			System.out.println(reverseArr[k]);
//		}

//22
//int[] newArr= {123,145,567,34567};
//int size=newArr.length;
//for(int i=0;i<size;i++) {
//	int num=newArr[i];
//	int rev=0;
//	while(num>0) {
//		int digit=num%10;
//		rev=rev*10+digit;
//		num/=10;
//		
//		
//	}
//	System.out.println(rev);
//}

//23

//		int[] newArr=new int[3];
//		newArr[0]=1;
//		newArr[1]=2;
//		newArr[2]=3;
//		
//		System.out.println(newArr[0]);
//		System.out.println(newArr[1]);
//		System.out.println(newArr[2]);

//24
//		int max=0;
//		for(int i=0;i<n;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);

//25
//		int first=0;
//		int second=0;
//		for (int i = 0; i < n; i++) {
//			if(arr[i]>first) {
//				second=first;
//				first=arr[i];
//			}else if(arr[i]!=first && arr[i]>second) {
//				second=arr[i];
//			}
//			
//		}
//		System.out.println(second);

	}

	public static int count(int n) {
		int ans = 0;
		while (n > 0) {
			ans += 1;
			n /= 10;
		}

		return ans;
	}

	public static boolean armStrongNumber(int a) {
		int size = count(a);
		int temp = a;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, size);
			temp /= 10;
		}
		if (sum == a) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isaPalindrome(int n) {
		int temp1 = n;
		int rev = 0;
		while (temp1 > 0) {
			int digit = temp1 % 10;
			rev = rev * 10 + digit;
			temp1 /= 10;
		}
		if (rev == n) {
			return true;
		} else {
			return false;
		}
	}

}
