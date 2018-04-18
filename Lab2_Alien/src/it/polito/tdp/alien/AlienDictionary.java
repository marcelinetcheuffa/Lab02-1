package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	private List<Word> dictionary;
	
	public AlienDictionary() {
		dictionary = new ArrayList<Word>();
	}
		
	
	public void addWord(String alienWord, String translation) {
		Word w = new Word(alienWord, translation);
		if(dictionary.contains(w)){
			dictionary.remove(w);
			dictionary.add(w);
		} else{
			dictionary.add(w);
		}
		
	 }
	
	 public String translateWord(String alienWord){
		 Word w = new Word(alienWord,"");
		 int index = dictionary.indexOf(w);
		 if(index<0)return null;
		 return dictionary.get(index).getTranslation();
		 
	 }


	@Override
	public String toString() {
		return "AlienDictionary [dictionary=" + dictionary + "]";
	}

}
