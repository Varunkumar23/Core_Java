package polymorphismAssignment;


public class polymorphismBillingSystem {

	static abstract class MenuItem {
		abstract double calculatePrice(double price);
	}

	static class VegItem extends MenuItem {
		double calculatePrice(double price) {
			return price + (price * 0.05);
		}
	}

	static class NonVegItem extends MenuItem {
		double calculatePrice(double price) {
			return price + (price * 0.10) + 30;
		}
	}

	public static void main(String[] args) {

		MenuItem vegTItem = new VegItem();
		System.out.println(vegTItem.calculatePrice(567));
	}

}
