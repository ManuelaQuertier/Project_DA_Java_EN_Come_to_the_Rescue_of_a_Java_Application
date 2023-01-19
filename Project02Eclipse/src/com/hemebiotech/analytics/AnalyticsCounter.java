package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile FileReader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		FileReader.GetSymptoms();

		SymptomsCounter NumberOfOccurence = new SymptomsCounter();

		WriteSymptomCountResult WriterResult = new WriteSymptomCountResult("Project02Eclipse/result.out",
				NumberOfOccurence.Counter(FileReader.GetSymptoms()));
		WriterResult.writeCount();
	}
}
