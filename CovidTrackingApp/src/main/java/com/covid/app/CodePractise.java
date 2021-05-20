package com.covid.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CodePractise {

	public static void main(String[] args) {
		String sentence = "This is@ Krishna12332@ Pr32`sad @@@Chitikel@@@";
		System.out.println(getWords(sentence));
		System.out.println();
		System.out.println();
		System.out.println(getStrings());
	}
	
// Program for Removing Special characters from the Sentence and Returns List 
	private static List<String> getWords(String sentence) {
		 String array = sentence.replaceAll("[^a-zA-Z]", " ");
		  array = array.replaceAll("( )+", " ");
		 String str[] = array.split(" ");
		 List<String> al = new ArrayList<String>();	 
		 al = Arrays.asList(str);
		return al;
	}
	
	
// Program for Create HashMap with Array of Strings as Key value and String length as value in HashMap
	public static HashMap<String,Integer> getStrings(){
		
		String str1[] = {"krishna","Ravi","srikanth","prudvi","Nikhil","venky","chaitu"};

	    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
	    for(String str2 : str1){
	        
	    	hashmap.put( str2,str2.length());
	    }
       
		return hashmap;
		
		
	}

}
