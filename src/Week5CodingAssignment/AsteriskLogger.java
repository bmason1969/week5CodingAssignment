package Week5CodingAssignment;

import java.util.Date;

public class AsteriskLogger implements Logger{
	
	public static void main(String[] args) {
		
	}
	
	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String message = "***Error: " + error + "***";
		
		int n = message.length();
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println(message);
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		 }
		System.out.println();
	}
	
	
	}	
	
		


