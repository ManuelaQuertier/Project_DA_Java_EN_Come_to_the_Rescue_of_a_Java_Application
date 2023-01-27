package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * This the class where the Counter method is implemented.
 *
 */
public class SymptomsCounter {
	/**
	 * This method order the symptoms in a treeMap and count the number of
	 * occurrence for each symptom
	 * 
	 * @param symptomsList a list of symptoms
	 * 
	 * @return a treeMap where keys are the symptoms names and values are the number
	 *         of occurrence
	 */
	public static Map<String, Integer> counter(List<String> symptomsList) {

		Map<String, Integer> symptomsMap = new TreeMap<String, Integer>();

		for (String symptom : symptomsList) {

			if (symptomsMap.containsKey(symptom)) {
				symptomsMap.put(symptom, symptomsMap.get(symptom) + 1);
			} else {
				symptomsMap.put(symptom, 1);
			}
		}
		return symptomsMap;
	}
}