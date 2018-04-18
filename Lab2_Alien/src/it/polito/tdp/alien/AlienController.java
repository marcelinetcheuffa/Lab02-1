/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary dictionary = new AlienDictionary();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtWord"
    private TextField txtWord; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void handleClear(ActionEvent event) {
    	txtWord.clear();
    	txtResult.clear();
    	
    }

    @FXML
    void handleTranslate(ActionEvent event) {
    	
    	String riga = txtWord.getText().toLowerCase();
    	
    	// Controllo sull'input
    	
    	if(riga == null || riga.length()== 0){
    		txtResult.appendText("Inserisci una o due parole.");
    		return ;
    	}
    	if(!riga.matches("[a-zA-Z]")) {
    		txtResult.appendText("Inserisci solo caratteri alfetici.");
    		return;
    	}
    	
    	String array[] = riga.split(" ");
    	
    	if(array.length == 1) {
    		
    		String translation = dictionary.translateWord(array[0]);
    		
    			txtResult.appendText(translation );
    			
    	}  else {
    		
    			dictionary.addWord(array[0],array[1] ) ;
            	System.out.println(dictionary);
            	
            	txtResult.appendText(array[1]);
            	
            	txtResult.appendText("\n");
            		
    		
    		
    	}
    	txtWord.clear();
    	    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}

