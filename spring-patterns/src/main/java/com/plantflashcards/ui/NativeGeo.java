package com.plantflashcards.ui;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class NativeGeo implements PlantDecorator {

	@Override
	public String getTemplate() {
		return "fragments/native";
	}

	@Override
	public String getLabel() {
		return "Native";
	}

	@Override
	public void processSubmission(Map<String, String> params) {
		// TODO Auto-generated method stub
		
	}
	
	
}
