package org.example.main;

import org.example.logger.Logger;

public class Program {
	public static void main(String[] args) {
		Logger loggerObj = Logger.getInstance();

		loggerObj.log("Application started.");
		loggerObj.log("User logged in.");
		System.out.println("Logs : \n" + loggerObj.getLog());

		loggerObj.clearLog();

		loggerObj.log("Application terminated.");
		System.out.println("Logs after clearing : \n" + loggerObj.getLog());
	}
}
