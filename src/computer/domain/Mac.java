package computer.domain;

import computer.service.AbstractComputerService;

public class Mac extends AbstractComputerService{

	@Override
	public String typeOfOs() {
		return "macOS";
	}
	
}
