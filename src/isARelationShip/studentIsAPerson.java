package isARelationShip;


class Person{
	String name;
	int age;
}

class Student extends Person{
	int rollNumber;
}
public class studentIsAPerson {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.name="Varun";
		student.age=21;
		student.rollNumber=1221;
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println(student.rollNumber);

	}

}
