package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter {

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