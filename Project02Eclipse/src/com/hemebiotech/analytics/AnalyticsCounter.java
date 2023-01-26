package com.hemebiotech.analytics;

import java.util.List;

/**
 * The main Class of the application
 * 
 */
public class AnalyticsCounter {
	/**
	 * Reader,Writer and methods are called here. The Reader generate a list of
	 * symptoms from the data. The Symptoms Counter count the symptoms and order
	 * them by key-value The Writer write the result on result.out
	 */

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile FileReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = FileReader.GetSymptoms();

		WriteSymptomCountResult WriterResult = new WriteSymptomCountResult("Project02Eclipse/result.out",
				SymptomsCounter.counter(symptoms));
		WriterResult.writeCount();
	}
}
