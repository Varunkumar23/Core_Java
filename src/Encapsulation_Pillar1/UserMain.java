package Encapsulation_Pillar1;

public class UserMain {

	public static void main(String[] args) {

		User u1 = new User(1, "user1@gmail.com", "User@123");

		System.out.println("Details of user 1: ");

		System.out.println(u1.getId());
		System.out.println(u1.getEmail());

		User u2 = new User(2, "user2@gmail.com", "User@456");

		System.out.println("Details of user 2: ");

		System.out.println(u2.getId());
		System.out.println(u2.getEmail());
		
		
		System.out.println("Details of user 3: ");

		User u3 = new User(3, "user3@gmail.com", "123qefqewe");
		System.out.println(u3.getId());
		System.out.println(u3.getEmail());
		
		
		

	}

}
