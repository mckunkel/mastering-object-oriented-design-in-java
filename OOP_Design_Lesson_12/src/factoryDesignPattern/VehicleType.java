package factoryDesignPattern;

public enum VehicleType {

	CAR {
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	TRUCK {
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	ELECTRIC {
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};

	abstract Vehicle getVehicle();

}
