package HashMap;

import java.util.HashMap;

import Colours.Colour;

public class HashMapdemo {

	public static void main(String[] args) {
		// Introduction
		// Intro
		System.out.println("========================");
		System.out.println(Colour.CYAN_UNDERLINED + "Title:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT
				+ "Maps & HashMaps Demo");
		System.out.println(Colour.CYAN_UNDERLINED + "Genre:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT
				+ "Java Intermediate");
		System.out.println(Colour.CYAN_UNDERLINED + "Author:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT
				+ "Peter Broadbent");
		System.out.println(
				Colour.CYAN_UNDERLINED + "Language:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT + " Java");
		System.out.println(Colour.CYAN_UNDERLINED + "Version:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT
				+ System.getProperty("java.version"));
		System.out.println(Colour.CYAN_UNDERLINED + "Description:" + Colour.RESET + " " + Colour.YELLOW_BOLD_BRIGHT
				+ "\n\tHashMaps and a few demos." + "\n\tMaps are a Set of Key Value Pairs" + "\n" 
				+ "\n\tExample: "
				+ "\n" + Colour.CYAN_BOLD_BRIGHT 
				+ "\n\tHashMap<String, Integer> empIds = new HashMap<>();"
				+ "\n");

		System.out.println(Colour.RESET);

		System.out.println("===================================================================\n");
		System.out.println("");

		System.out.println("Map is the Interface.");
		HashMap<String, Integer> empIds = new HashMap<>();

		empIds.put("Peter", 007);
		empIds.put("Jerry", 005);
		empIds.put("Tom", 004);
		empIds.put("Jabe", 003);
		System.out.println("Printing out empIds..\n");
		System.out.println(empIds);

		System.out.println("Peter's Employee Id is:");
		System.out.println("\t" + empIds.get("Peter"));

		
		System.out.println("\nQuery the data using 'containsValue and containsKey");
		System.out.println("Does out HashMap contain a 'Jerry' (containsKey)?");
		System.out.println(empIds.containsKey("Jerry"));

		// Ask our question
		System.out.println("Does the HashMap contain Employee Value '12345'(containsValue)?");
		System.out.println(empIds.containsValue(12345));

		// Add John 12345 to Map
		System.out.println("\nPutting 'John:12345' in to HashMap");
		
		empIds.put("John", 12345);
		System.out.println("\n" + empIds);

		// Ask our question again
		System.out.println("");
		System.out.println("Does the Map contain Employee Value '12345'");
		System.out.println(empIds.containsValue(12345));

	}

}
