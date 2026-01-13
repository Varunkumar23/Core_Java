package stringClass;

public class stringBuffer {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);

		s1.insert(0, "Hii ");
		System.out.println(s1);

		// reverse
		s1.reverse();
		System.out.println(s1);

		// replace
		s1.replace(1, 3, "ey");
		System.out.println(s1);

		s1.reverse();
		
		//delete
		System.out.println(s1.delete(1, s1.length()-1));
		
		System.out.println(s1.capacity());
	

	}

}
