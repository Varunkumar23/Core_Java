package polymorphismAssignment;

public class polymorphismVehicleRental {

	static class Rental {
		int calculateRent(int km) {
			return km * 2;
		}
	}

	static class Bike extends Rental {
		int calculateRent(int km) {
			return km * 5 + 50;
		}
	}

	static class Auto extends Rental {
		int calculateRent(int km) {
			return km * 10 + 50;
		}
	}

	static class Car extends Rental {
		int calculateRent(int km) {
			return km * 15 + 50;
		}
	}

	public static void main(String[] args) {
		Rental bikeRental=new Bike();
		System.out.println(bikeRental.calculateRent(30));
		
		Rental autoRental=new Auto();
		System.out.println(autoRental.calculateRent(15));
		
		Rental caRental=new Car();
		System.out.println(caRental.calculateRent(30));

	}

}
