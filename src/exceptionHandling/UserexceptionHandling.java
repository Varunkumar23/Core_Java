package exceptionHandling;

import java.io.IOException;

public class UserexceptionHandling {

	static class User {
		private String userName;
		private String password;

		User(String userName, String password) {
			if (userName == null || userName.isEmpty()) {
				throw new IllegalArgumentException("Username should not be empty");
			}

			if (password == null || password.length() < 6) {
				throw new IllegalArgumentException("Length of the password must be at least 6");
			}

			this.userName = userName;
			this.password = password;

			System.out.println("User created Successfully");

		}

		public String getUserName() {
			return userName;
		}

		public boolean validatePassword(String enteredPassword) {
			return this.password == enteredPassword;
		}
	}

	static void saveUser(User user) throws IOException {

	}

	public static void main(String[] args) {

	}

}
