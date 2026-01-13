package inheritancePillar2;

public class InterfacesImplementation {

	interface Notification {
		void send(String message);

		default void log() {
			System.out.println("Notification sent successfully");
		}
		
		static void info() {
		    System.out.println("Notification service v1.0");
		}


	}

	static class EmailNotification implements Notification {
		public void send(String message) {
			System.out.println("Sending email notification: " + message);
		}

	}

	static class SMSNotification implements Notification {
		public void send(String message) {
			System.out.println("Sending SMS Notification: " + message);
		}
	}

	static class PushNotification implements Notification {
		public void send(String message) {
			System.out.println("Sending push Notification: " + message);

		}
	}

	public static void main(String[] args) {

		Notification notification;

		notification = new EmailNotification();
		notification.send("Division of career services: You are shortlisted for accenture");
		notification.log();

		notification = new SMSNotification();
		notification.send("Your recharge will be over in few days");
		notification.log();

		notification = new PushNotification();
		notification.send("2 GB data is used");
		notification.log();
		
		Notification.info();

	}

}
