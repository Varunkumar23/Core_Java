package exceptionHandling;

public class userAuthentication {
	static class UserAuth {

		public static void validCredentials(String userName, String password) {
			if (userName == null || userName.isEmpty()) {
				throw new IllegalArgumentException("Username cannot be null or empty");
			}

			if (password == null || password.length() < 6) {
				throw new IllegalArgumentException("Password must be at least 6 characters");
			}

			if (!userName.equals("admin")) {
				throw new IllegalStateException("Access denied");
			}
			if (!password.equals("admin123")) {
				throw new IllegalStateException("Incorrect password");
			}

			System.out.println("Login Successfull!");
		}
	}

	public static void main(String[] args) {

		try {
			UserAuth.validCredentials("admn", "admin123");
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Credentials: " + e.getMessage());
		} catch (IllegalStateException e) {
			System.out.println("Invalid state: " + e.getMessage());
		} finally {
			System.out.println("Login attempt completed");
		}

	}

}
