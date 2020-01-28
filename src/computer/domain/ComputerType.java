package computer.domain;

public enum ComputerType {
	WINDOWS("Windows"), MAC("Mac"), CHROMEBOOK("ChromeBook"), INVALID("Invalid");

	private String computerType;

	ComputerType(String computerType) {
		this.computerType = computerType;
	}

	public static ComputerType getTypeFromUser(String typeOfComputer) {
		ComputerType[] values = ComputerType.values();

		for (ComputerType computerType : values) {
			if (computerType.getComputerType().equalsIgnoreCase(typeOfComputer)) {
				return computerType;
			}
		}
		return INVALID;
	}

	public String getComputerType() {
		return computerType;
	}

	
}
