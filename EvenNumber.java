package com.Array;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = Arrays.asList(1,20,3,4,56,56);
		integerList.stream()
		.filter(n->n%2==0)
		.forEach(System.out::println);
	}

}
////str.chars()
//
//This method converts the string str into an IntStream of characters. Each character in the string is represented by its Unicode code point (an integer value).
//
//.mapToObj(c -> (char) c)
//
//This line maps each integer code point (c) in the IntStream back to a Character object. The lambda expression (c -> (char) c) casts the integer code point to a char, effectively converting the IntStream into a Stream<Character>.
//
//.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//
//This collects the Stream<Character> into a Map where the keys are characters (Character type) and the values are the count of occurrences (Long type).
//
//Collectors.groupingBy(c -> c) groups the characters by their value.
//
//Collectors.counting() counts the number of occurrences of each character within its group.
//
//Map<Character, Long> charFrequency = ...
//
//This assigns the resulting Map of character frequencies to the variable charFrequency.
//
//System.out.println("Character Frequency: " + charFrequency);
//
//This prints the charFrequency map to the console, displaying the frequency of each character in the string.