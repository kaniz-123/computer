package computer.service;

public abstract class AbstractComputerService implements ComputerService {

	public AbstractComputerService(boolean hasCPU, boolean hasRAM, boolean hasPowerSupply, String typeOfOs) {
		super();
	}

	public AbstractComputerService() {
		super();
	}

	@Override
	public boolean hasCPU() {
		return true;
	}

	@Override
	public boolean hasRAM() {
		return true;
	}

	@Override
	public boolean hasPowerSupply() {
		return true;
	}
}
