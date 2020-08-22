package util;

import java.util.Scanner;

public final class Reader {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	private Reader() {}
	
	public static String readString() {
		return scanner.nextLine();
	}
	
	public static int readInt() {
		int intRead = scanner.nextInt();
		scanner.nextLine();
		return intRead;
	}
	
	public static void closeScanner() {
		scanner.close();
	}
}
