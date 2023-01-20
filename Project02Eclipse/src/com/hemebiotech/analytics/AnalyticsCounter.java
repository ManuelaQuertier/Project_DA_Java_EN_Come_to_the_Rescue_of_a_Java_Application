package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile FileReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = FileReader.GetSymptoms();

		WriteSymptomCountResult WriterResult = new WriteSymptomCountResult("Project02Eclipse/result.out",
				SymptomsCounter.counter(symptoms));
		WriterResult.writeCount();
	}
}
