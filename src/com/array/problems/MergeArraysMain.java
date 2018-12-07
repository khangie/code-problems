package com.array.problems;

import java.util.ArrayList;

public class MergeArraysMain {

	/**
	 * Problem
	 * - Merge two arrays together
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String[] words = new String[] {"Test1", "Test2"};
		String[] more = new String[] {"Test3", "Test4"};
		
		ArrayList<String> sentence = merge(words, more);
		System.out.println(sentence);
		
	}
	
	public static ArrayList<String> merge(String[] words, String[] more) {
		
		ArrayList<String> sentence = new ArrayList<>();
		
		for (String word : words) {
			sentence.add(word);
		}
		
		for (String word : more) {
			sentence.add(word);
		}
		
		return sentence;
		
	}
	
}
