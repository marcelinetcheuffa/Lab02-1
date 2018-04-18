package it.polito.tdp.alien;



public class Word {
	private String alienWord;
	private String translation;
	
	
	public Word(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
		
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		return translation;
	}
	
	public String toString() {
		return alienWord + " " + translation;
	}

	public boolean equals(Object obj){
		
		if(obj instanceof Word){
			Word word2 = (Word)obj;
			return this.alienWord.equals(word2.alienWord);
		}
		return false;
		
	}

	public void setTranslate(String translation) {
		this.translation = translation;
	}


}
