package hasAAssignment;

public class CarHasEngine {

	static class Engine {
		String engineType;
		int horsePower;

		public Engine(String engineType, int horsePower) {
			this.engineType = engineType;
			this.horsePower = horsePower;
		}

		String getEngineType() {
			return engineType;
		}

		int getHorsePower() {
			return horsePower;
		}

	}

	static class Car {
		String brand;
		Engine engine;

		Car(String brand, Engine engine) {
			this.brand = brand;
			this.engine = engine;
		}

		String getBrand() {
			return brand;
		}

	}

	public static void main(String[] args) {

		Engine engine = new Engine("Mahindra", 170);
		Car car = new Car("THAR", engine);
		System.out.println(car.getBrand());
		System.out.println(car.engine.getEngineType());
		System.out.println(car.engine.getHorsePower());

	}

}
