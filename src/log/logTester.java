package log;

public class logTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
		logger.log("test");

	}

}
