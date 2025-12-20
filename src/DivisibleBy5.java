
public class DivisibleBy5 {
		public static void main(String[] args) {
			int a=10;
			
			String ans=(a%5==0)? "Divisible by 5" : "Not divisible by 5";
			System.out.println(ans);
			
			String ans1=(a%5==0 && a%3==0)? "Divisible by 3 and 5" : "Not divisible by 3 and 5";
			System.out.print(ans1);
			
			
			
			if(a%3==3 && a%5==0) {
				System.out.println("Both");
			}else if(a%5==0) {
				System.out.println("only 5");

			}else if(a%3==0) {
				System.out.println("Only 3");

			}else {
				System.out.println("no by both");

			}
			
			}
	
}
