package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;

public class WriteSymptomCountResult {

	private String filepath;

	public WriteSymptomCountResult(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public void writeCount() {

		if (filepath != null) {
			try {
				FileWriter writer = new FileWriter(filepath);
				writer.write("hello");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
