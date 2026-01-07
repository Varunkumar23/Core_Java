package encapsulationPillar1;

public class Product {

	// when we wrap private variables and public getter and setter methods in a
	// class then it is called java beam class
	private int price;

//setter
	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		} else {
			throw new IllegalArgumentException("Invalid price");
		}
	}

//getter

	public int getPrice() {
		return price;
	}
}
