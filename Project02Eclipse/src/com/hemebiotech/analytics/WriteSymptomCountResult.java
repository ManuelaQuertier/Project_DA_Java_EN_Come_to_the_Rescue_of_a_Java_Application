package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomCountResult implements ISymptomWriter {

	private String filepath;
	public Map<String, Integer> myMap;

	public WriteSymptomCountResult(String filepath, Map<String, Integer> myMap) {
		this.filepath = filepath;
		this.myMap = myMap;
	}

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */

	@Override
	public void writeCount() {

		if (filepath != null) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

				for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
					writer.write(entry.getKey() + " = " + entry.getValue());
					writer.newLine();
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
