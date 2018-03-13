package com.plantflashcards.ui;

import java.util.Map;

public interface PlantDecorator {

	/**
	 * HTML Template
	 * @return the name of the HTML template to render the UI options.
	 */
	String getTemplate();
	
	/**
	 * A label that will allow the user to select an item.
	 * @return
	 */
	String getLabel();
	
	/**
	 * How to handle the request parameter (name value pairs) of the submitted form.
	 * @param params request parameter
	 */
	void processSubmission(Map<String, String> params);
	
}
