package WebDevelopment;
import java.util.*;

public class UserAuthenticationUsingHashMap {
	
	class User{
		private String email;
		private String password;
		private String role;
		
		
		public User(String email,String password,String role) {
			this.email=email;
			this.password=password;
			this.role=role;
	
		}
		
	
		
		public String getEmail() {
			return email;
		}
		
		public String getPassword() {
			return password;
		}
		
		public String getRole() {
			return role;
		}
	}
	
	class UserService{
		private HashMap<String,User> userDetails=new HashMap<>();
		
		public void register(String email,String password,String role) {
			if(userDetails.containsKey(email)) {
	            throw new RuntimeException("User already exists");
			}
			
			User user=new User(email,password,role);
			
			userDetails.put(email,user);
			
			System.out.println("User Successfully Registered");
			
			
			
		}
		
		public boolean login(String email,String password) {
			User user=userDetails.get(email);
			if(user==null) {
				throw new RuntimeException("User does not Exists!");
			}
			
			if(!user.getPassword().equals(password)){
				throw new RuntimeException("Invalid Password");
			}
			return true;
		}
		
		public User getUserProfile(String email) {
			return userDetails.get(email);
		}
	}
	
	
}
