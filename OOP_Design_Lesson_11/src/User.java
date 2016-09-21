
public class User {
	private String userName;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String address;

	private User(Builder builder) {
		this.userName = builder.userName;
		this.emailAddress = builder.emailAddress;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailAddress=" + emailAddress + ", fisrtName=" + firstName
				+ ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	public static class Builder {

		private String userName;
		private String emailAddress;
		private String firstName;
		private String lastName;
		private int phoneNumber;
		private String address;

		public Builder(String userName, String email) {
			this.userName = userName;
			this.emailAddress = email;
		}

		public Builder firstName(String value) {
			this.firstName = value;
			return this;
		}

		public Builder lastName(String value) {
			this.lastName = value;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

}
