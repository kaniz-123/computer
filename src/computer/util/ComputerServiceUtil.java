package computer.util;

import java.util.Scanner;

import computer.domain.ChromeBook;
import computer.domain.ComputerType;
import computer.domain.Mac;
import computer.domain.Windows;
import computer.service.AbstractComputerService;
import computer.service.ComputerService;

public class ComputerServiceUtil {
	public static ComputerService createFromUserInput() {
		ComputerService computerService = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter type of computer want to know about : Windows, Mac, ChromeBook");

		String typeOfComputer = scanner.next();
		checkNullOrEmpty("TypeOfComputer", typeOfComputer);
		ComputerType typeFromUser = ComputerType.getTypeFromUser(typeOfComputer);
		
		if (typeFromUser == ComputerType.INVALID) {
			throw new IllegalArgumentException(
					"The possible value of computer type can be " + ComputerType.WINDOWS.getComputerType() + ","
							+ ComputerType.MAC.getComputerType() + "," + ComputerType.CHROMEBOOK.getComputerType());
		}

		if (typeFromUser == ComputerType.WINDOWS) {
			computerService = new Windows();
		} else if (typeFromUser == ComputerType.MAC) {
			computerService = new Mac();
		} else if (typeFromUser == ComputerType.CHROMEBOOK) {
			computerService = new ChromeBook();
		}
		return computerService;
	}

	private static void checkNullOrEmpty(String fieldName, String value) {
		if (value == null || value.isEmpty()) {
			throw new IllegalArgumentException(fieldName + "Value cannot be null or empty.");
		}
	}

	public static void printResult(ComputerService computerService) {
		System.out.println("Has CPU : " + computerService.hasCPU());
		System.out.println("Has RAM : " + computerService.hasRAM());
		System.out.println("Has power Supply : " + computerService.hasPowerSupply());
		System.out.println("What type of OS : " + computerService.typeOfOs());
	}
}