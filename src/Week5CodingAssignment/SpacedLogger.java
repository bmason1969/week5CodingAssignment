package Week5CodingAssignment;

public class SpacedLogger implements Logger {

	public static void main(String[] args) {
				

		
	}

	@Override
	public void log(String log) {
		for(int i = 0; i < log.length(); i++) {
			System.out.print(log.charAt(i)+ " ");
		}
		
	}

	@Override
	public void error(String error) {
		System.out.print("ERROR: " );
		for(int i = 0; i < error.length(); i++) {
			System.out.print(error.charAt(i)+ " ");
		}
		
	}

		
}

