package DecisionMaking;
import java.util.Scanner;

public class DynamicInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	byte b=sc.nextByte();
	short s=sc.nextShort();
	int i=sc.nextInt();
	long l=sc.nextLong();
	float f=sc.nextFloat();
	double d=sc.nextDouble();
	boolean status=sc.nextBoolean();
	String name=sc.next();
	String info=sc.nextLine();
	char c=sc.next().charAt(0);
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(status);
	System.out.println(name);
	System.out.println(info);
	System.out.println(c);

	
	
}
}
