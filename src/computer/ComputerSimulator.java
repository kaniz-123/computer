package computer;

import computer.service.ComputerService;
import computer.util.ComputerServiceUtil;

public class ComputerSimulator {

	public static void main(String[] args) {
		try {
			ComputerService computerFromUserUserInput = ComputerServiceUtil.createFromUserInput();
			ComputerServiceUtil.printResult(computerFromUserUserInput);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Program execution completed.");
		}
	}
}