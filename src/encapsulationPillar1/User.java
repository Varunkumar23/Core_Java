package encapsulationPillar1;

public class User {
	private final int id;
	private String email;
	private String password;

	public User(int id, String email, String password) {
		this.id = id;
		setEmail(email);
		setPassword(password);

	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null) {
			throw new IllegalArgumentException("Email cannot be null");
		}

		email = email.trim();

		if (email.length() < 10 || email.length() > 25) {
			throw new IllegalArgumentException("Invalid email length");
		}
		this.email = email;

	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 8) {
			this.password = password;
		} else {
			throw new IllegalArgumentException("Password is too weak");
		}
	}
}
