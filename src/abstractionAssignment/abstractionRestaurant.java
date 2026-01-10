package abstractionAssignment;

public class abstractionRestaurant {

	static abstract class Restaurant {
		abstract void prepareFood();

		void orderReceived() {
			System.out.println("Order is recieved successfully!");
		}
	}

	static class FastFoodRestaurant extends Restaurant {
		void prepareFood() {
			System.out.println("Preparing your fast food takes 15 minutes approx");
		}
	}

	static class FineDiningRestaurant extends Restaurant {
		void prepareFood() {
			System.out.println(
					"Preparing your Fine Dining 30 minutes approx, Until then please enjoy the chineese chicken soup");

		}
	}

	public static void main(String[] args) {
		Restaurant fastFoodRestaurant = new FastFoodRestaurant();

		fastFoodRestaurant.prepareFood();
		fastFoodRestaurant.orderReceived();

		Restaurant fineDineRestaurant = new FineDiningRestaurant();
		fineDineRestaurant.prepareFood();
		fineDineRestaurant.orderReceived();
	}

}
