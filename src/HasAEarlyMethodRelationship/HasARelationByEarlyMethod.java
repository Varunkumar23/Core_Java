package HasAEarlyMethodRelationship;

public class HasARelationByEarlyMethod {

	// this Has-A relation implemented by early initialization in which we have used
	// single line non static initializers

	static class engine {
		private int hp;

		public engine(int hp) {
			this.hp = hp;
		}

		public int getHp() {
			return hp;
		}

	}

	static class Car {
		private String modelName;

		public Car() {
		}

		public Car(String modelName) {
			this.modelName = modelName;
		}

		public String getModelName() {
			return modelName;
		}

		private engine e = new engine(1000);
		
		

	}

	public static void main(String[] args) {
		Car c = new Car("Mahindra Thar");
		System.out.println(c.getModelName());
		
		// so with the help of method chaining we can access engine through object Car c			
		System.out.println(c.e.getHp());
		// so, after jvm executes this line it automatically loads the engine reference
		// variable also so that we can say car Has-A engine.
	}

}
