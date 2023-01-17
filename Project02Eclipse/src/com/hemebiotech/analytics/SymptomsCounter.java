package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomsCounter {

	List<String> myList = new ArrayList<String>();
	Map<String, Integer> myMap = new HashMap<String, Integer>();

	public void Counter(List<String> myList) {

		for (String symptom : myList) {

			if (myMap.containsKey(symptom)) {
				myMap.put(symptom, myMap.getOrDefault(symptom, 1) + 1);
			} else {
				myMap.put(symptom, 1);
			}

		}
		System.out.println(myMap);
	}
}