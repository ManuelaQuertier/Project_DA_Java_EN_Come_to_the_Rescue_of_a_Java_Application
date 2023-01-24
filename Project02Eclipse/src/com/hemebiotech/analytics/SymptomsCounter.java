package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter {
	/**
	 * This method order the symptoms in a treeMap and count the number of
	 * occurrence for itch symptom
	 * 
	 * @param myList a list of symptoms
	 * @return a treeMap where keys are the symptoms names and values are the number
	 *         of occurrence
	 */
	public static Map<String, Integer> counter(List<String> myList) {

		Map<String, Integer> myMap = new TreeMap<String, Integer>();

		for (String symptom : myList) {

			if (myMap.containsKey(symptom)) {
				myMap.put(symptom, myMap.get(symptom) + 1);
			} else {
				myMap.put(symptom, 1);
			}

		}

		return myMap;
	}
}