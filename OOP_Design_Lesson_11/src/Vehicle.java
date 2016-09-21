public class Vehicle {

	private int price;
	private String type;
	private String make;
	private int horsePower;
	private String model;
	private String color;
	private int numDoors;

	private Vehicle(Builder builder) {
		this.price = builder.price;
		this.type = builder.type;
		this.make = builder.make;
		this.horsePower = builder.horsePower;
		this.model = builder.model;
		this.color = builder.color;
		this.numDoors = builder.numDoors;

	}

	@Override
	public String toString() {
		return "Vehicle [price=" + price + ", type=" + type + ", make=" + make + ", horsePower=" + horsePower
				+ ", model=" + model + ", color=" + color + ", numDoors=" + numDoors + "]";
	}

	public static class Builder {
		private int price;
		private String type;
		private String make;
		private int horsePower;
		private String model;
		private String color;
		private int numDoors;

		public Builder(String type) {
			this.type = type;
		}

		public Builder price(int value) {
			this.price = value;
			return this;
		}

		public Builder numDoors(int value) {
			this.numDoors = value;
			return this;
		}

		public Builder horsePower(int value) {
			this.horsePower = value;
			return this;
		}

		public Builder make(String value) {
			this.make = value;
			return this;
		}

		public Builder model(String value) {
			this.model = value;
			return this;
		}

		public Builder color(String value) {
			this.color = value;
			return this;
		}

		public Vehicle build() {
			return new Vehicle(this);
		}

	}

}
