package polymorphismAssignment;

public class polymorphismOnlineNotification {

	static class Notification {
		public void send() {
			System.out.println("General Notification!");
		}
	}

	static class EmailNotification extends Notification {
		public void send() {
			System.out.println("Email Notification!");
		}
	}

	static class SMSNotification extends Notification {
		public void send() {
			System.out.println("SMSNotification Notification!");
		}
	}

	static class PushNotification extends Notification {
		public void send() {
			System.out.println("PushNotification Notification!");
		}
	}

	public static void main(String[] args) {
		Notification n1 = new EmailNotification();
		n1.send();
		Notification n2 = new SMSNotification();
		n2.send();
	}

}
