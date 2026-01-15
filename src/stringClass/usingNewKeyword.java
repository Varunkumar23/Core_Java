package stringClass;


public class usingNewKeyword {

	public static void main(String[] args) {

		String s1 = new String("Hello");

		String s2 = new String("Hello");

		System.out.println(s1 == s2);

		System.out.println(s1.equals(s2));

		// String functions

		String string = "Varun Kumar";
		System.out.println(string.length());
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println(string.startsWith("H"));
		System.out.println(string.endsWith("n"));

		System.out.println(string.charAt(6));
		
		
		char[] c=string.toCharArray();
		System.out.println(c);
		
		      
		//spilitting
		
		String str1="Hii Hello Bye Miss You";
		String[] arr=str1.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		//concat
		
		String xString="Hii";
		System.out.println(xString.concat(" Everyone"));
		
		
		//substring
		
		String string2="Lovely Professional University";
		System.out.println(string2.substring(3));
		System.out.println(string2.substring(3,8)); //in this case the ending index will not be included
		
		
		

	}

}
