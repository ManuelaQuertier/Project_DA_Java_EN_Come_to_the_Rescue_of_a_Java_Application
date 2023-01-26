package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Implementation of the Writer
 *
 */
public class WriteSymptomCountResult implements ISymptomWriter {

	private String filepath;
	public Map<String, Integer> symptomsMap;

	public WriteSymptomCountResult(String filepath, Map<String, Integer> symptomsMap) {
		this.filepath = filepath;
		this.symptomsMap = symptomsMap;
	}

	/**
	 * This method write the symptomsMap on the result.out doc. And by matching keys
	 * with their values.
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */

	@Override
	public void writeCount() {

		if (filepath != null) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));

				for (Map.Entry<String, Integer> entry : symptomsMap.entrySet()) {
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
