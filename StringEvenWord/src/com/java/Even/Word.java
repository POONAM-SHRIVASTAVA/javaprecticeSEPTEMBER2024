package com.java.Even;

public class Word {
public static void printWords(String s) {
	for(String word: s.split("\\s+")) {
		
		if(word.length()%2==0) {
			
			System.out.println(word);
	
}
		
	}
}

public static void main(String arg[]) {
	String s=" my name is poonam";
	printWords(s);
}
}
