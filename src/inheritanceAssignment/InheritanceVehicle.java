package inheritanceAssignment;

public class InheritanceVehicle {

	static class Vehicle {
		int speed;
		String fuelType;

		public Vehicle(int speed, String fuelType) {
			this.speed = speed;
			this.fuelType = fuelType;
		}
	}

	static class Car extends Vehicle {
		String brand;

		Car(String brand, int speed, String fuelType) {
			super(speed, fuelType);
			this.brand = brand;
		}
	}

	public static void main(String[] args) {

		Car car = new Car("Thar", 120, "Diesel");
		System.out.println(car.brand);
		System.out.println(car.speed);
		System.out.println(car.fuelType);
	}

}
