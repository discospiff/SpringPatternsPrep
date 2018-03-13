package com.plantflashcards.ui;

import java.util.Map;

public class Woody implements PlantDecorator {

	@Override
	public String getTemplate() {
		return "fragments/woody";
	}

	@Override
	public String getLabel() {
		return "Woody Plant";
	}

	@Override
	public void processSubmission(Map<String, String> params) {
		// TODO Auto-generated method stub
		
	}
	
}
