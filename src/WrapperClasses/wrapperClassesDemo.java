package WrapperClasses;


public class wrapperClassesDemo {

	public static void main(String[] args) {
		//This process of converting primitive to non primitive is called Boxing
		//using new keyword
		int a = 10;
		Integer integer = new Integer(a);
		System.out.println(integer);

		//using valueOf method which is static so we can access that method by class name Integer
		int b = 20;
		Integer integer2 = Integer.valueOf(b);
		System.out.println(integer2);
		
		
		
		
		//AutoBoxing- the process of converting the primitive to non primitive automatically done by the compiler itself
		int x=30;
		Integer integer3=x;
		System.out.println(integer3);
		
		
		
		//Unboxing - The process of converting non primitive to the primitive it basically means removing the wrapper of an non-primitive to make it primitive again
		
		int c=40;
		Integer integer4=Integer.valueOf(c); //boxing
		int d=integer4.intValue();  // unboxing
		
		System.out.println(d);
		
		
		//for byte
		byte b1=50;
		Byte yByte=Byte.valueOf(b1);
		byte z=yByte.byteValue();
		System.out.println(z);
		
		
		//auto unboxing
		
		int s=77;
		Integer integer5=s;
		int f=integer5;
		System.out.println(f);
		
		
		
		
		

	}

}
