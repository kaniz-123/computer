package computer.domain;

import computer.service.AbstractComputerService;

public class Windows extends AbstractComputerService{

	@Override
	public String typeOfOs() {
		return "windowsOs";
	}
	

}
