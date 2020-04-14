package computer.domain;

import computer.service.AbstractComputerService;

public class ChromeBook extends AbstractComputerService {

	@Override
	public String typeOfOs() {
		return "chromeOS";
	}

}
