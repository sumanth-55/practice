package com.practice;
import java.util.*;
public class prizes {
	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores) {
		if (scores == null) {
		return null;
		}
		Map<Integer, String> result = new TreeMap<>();
		Set<Integer> keys = scores.keySet();

		for (int key : keys) {
		int marks = scores.get(key);
		// System.out.println(marks);
		if (marks >= 80) {
		result.put(key, "GOLD");
		} else if (marks < 80 && marks >= 60) {
		result.put(key, "SILVER");
		} else if (marks < 60 && marks >= 45) {
		result.put(key, "BRONZE");
		} else {
		result.put(key, "FAIL");
		}
		}


		for (Integer i : result.keySet()) {
		System.out.println(i + " " + result.get(i));
		}
		return result;
	}
	public static void main(String[] args) {
		//Use Scanner to get input from console
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Integer studentNumber = scanner.nextInt();
		
		Map<Integer, Integer> studentScores = new LinkedHashMap<>();
		while (studentNumber > 0) {
		Integer roll = scanner.nextInt();
		Integer marks = scanner.nextInt();
		if (marks <=100) {
		studentScores.put(roll, marks);
		}
		studentNumber--;
		}
		calculateGrade(studentScores);
		}

}
