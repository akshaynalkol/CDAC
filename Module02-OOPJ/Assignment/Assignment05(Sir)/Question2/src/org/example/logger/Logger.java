package org.example.logger;

public class Logger {
	private static Logger loggerObj;
	
	// private StringBuffer logMessage;
	private String logMessage;

	private Logger() {
		// logMessage = new StringBuffer();
		logMessage = "";
	}

	public static Logger getInstance() {
		if (loggerObj == null) {
			loggerObj = new Logger();
		}
		return loggerObj;
	}

	public void log(String message) {
		// logMessage.append(message).append("\n");
		// System.out.println(logMessage);
		logMessage += message + "\n";
	}

	public String getLog() {
		// return logMessage.toString();
		return logMessage;
	}

	public void clearLog() {
		// logMessage.setLength(0);
		logMessage = "";
	}
}
