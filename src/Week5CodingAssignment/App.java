package Week5CodingAssignment;

public class App {

	public static void main(String[] args) {
		Logger logger = new SpacedLogger();
		Logger loggerOne = new AsteriskLogger();
		logger.log("Hello");
		System.out.println();
		logger.error("Hello");
		System.out.println();
		loggerOne.log("Hello");
		System.out.println();
		loggerOne.error("Hello");

	}

}
