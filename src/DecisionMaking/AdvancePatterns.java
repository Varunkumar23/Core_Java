package DecisionMaking;

public class AdvancePatterns {
	public static void main(String[] args) {
		int n = 4;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i+j>=n+1 && j-i<=n-1) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//	}

//2

//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i<=j && i+j<=2*n) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//	}

//3

//	for(int i=1;i<2*n;i++) {
//		for(int j=1;j<=n;j++) {
//			if(i>=j && i+j<=2*n) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//	}

// 4

//	for(int i=1;i<2*n;i++) {
//		for(int j=1;j<=n;j++) {
//			if(i+j>=n+1 && i-j<=n-1) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//		
//	}

//5
//	for(int i=1;i<2*n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i+j>=n+1 && i-j<=n-1 && j-i<=n-1 && i+j<=3*n-1) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
//	

//6

//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i==4 || i+j==n+1 || j-i==n-1) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}

//Double triangles

//1

//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i>=j || j==2*n-1 || i==4 || i+j>=2*n  ) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}

//2
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(i==1 || j==1 || i+j<=n+1 || j-i>=n-1) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}

//butter fly

		for (int i = 1; i < 2 * n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (i + j == 2 * n || i == j || i == n || j == n - 3 || j == 2 * n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// square with hallow
//	for(int i=1;i<2*n;i++) {
//		for(int j=1;j<2*n;j++) {
//			if(!(i+j>=n+1 && i-j<=n-1 && j-i<=n-1 && i+j<=3*n-1)) {
//				System.out.print("* ");
//			}else {
//				System.out.print("  ");
//			}
//		}
//		System.out.println();
//	}
	}
}
