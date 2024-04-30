package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		String[] cities = {"bordeaux", "paris","marseille", "lyon", "nimes"};
		
		Arrays.stream(cities).forEach(el -> System.out.println(el));
		System.out.println(cities.length);
		
		cities[3] = "reims";
		Arrays.stream(cities).forEach(el -> System.out.println(el));
	}

}
