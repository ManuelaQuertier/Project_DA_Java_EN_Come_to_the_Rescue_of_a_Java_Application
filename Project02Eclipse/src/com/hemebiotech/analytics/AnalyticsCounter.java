package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile FileReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		FileReader.GetSymptoms();

		WriteSymptomCountResult WriterResult = new WriteSymptomCountResult("Project02Eclipse/result.out");
		WriterResult.writeSomething();

	}
}
