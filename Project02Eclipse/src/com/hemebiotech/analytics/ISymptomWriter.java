package com.hemebiotech.analytics;

/**
 * Anything that will write the result of the SymptomsCounter method on a text
 * doc.
 * 
 */
public interface ISymptomWriter {
	/**
	 * Write the treeMap on result.out doc
	 */

	public void writeCount();
}
