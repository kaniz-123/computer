package computer.service;

public interface ComputerService { // 1
	boolean hasCPU();

	boolean hasRAM();

	boolean hasPowerSupply();

	String typeOfOs();

}
