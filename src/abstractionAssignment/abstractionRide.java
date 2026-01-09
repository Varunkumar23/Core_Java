package abstractionAssignment;

public class abstractionRide {

	static abstract class Ride {
		abstract int calculateFare(int distance);

		public void rideDetails(int x) {
			System.out.println("Your fare for the ride is: " + x);
		}
	}

	static class Bike extends Ride {
		int calculateFare(int distance) {
			return distance * 2;
		}

	}

	static class Auto extends Ride {
		int calculateFare(int distance) {
			return distance * 5;
		}

	}

	static class Car extends Ride {
		int calculateFare(int distance) {
			return distance * 10;
		}

	}

	public static void main(String[] args) {

		Ride bikeRide = new Bike();
		bikeRide.rideDetails(bikeRide.calculateFare(10));

		Ride autRide = new Auto();
		autRide.rideDetails(autRide.calculateFare(10));

		Ride caRide = new Car();
		caRide.rideDetails(caRide.calculateFare(10));
	}

}
