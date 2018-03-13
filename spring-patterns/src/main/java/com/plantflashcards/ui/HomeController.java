package com.plantflashcards.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private List<PlantDecorator> plantDecorators;
	
	public HomeController() {
		plantDecorators = new ArrayList<PlantDecorator>();
		plantDecorators.add(new NativeGeo());
		plantDecorators.add(new Woody());
		
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model ) {
		model.addAttribute("name", name);
		return "welcome";
	}
	
	@RequestMapping("/addplant")
	public String addplant(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model ) {
		List<String> components = new ArrayList<String>();

		for (PlantDecorator plantDecorator : plantDecorators) {
			components.add(plantDecorator.getTemplate());	
		}
		
		// components.add("fragments/woody");
		model.addAttribute("components", components);
		model.addAttribute("name", name);
		model.addAttribute("plant", new Plant());
		return "addplant";
	}
	
	@RequestMapping(value = "/saveplant", method = RequestMethod.POST)
	public String savePlant(Woody woody, final BindingResult bindingResult, final ModelMap model, @RequestParam Map<String,String> requestParams) {
		int i = 1 + 1;
		Set<String> keySet = model.keySet();
		Collection<Object> values = model.values();
		
		// pass off to decorator.
		
		return "addplant";
	}

	@RequestMapping(value = "/saveplant", method = RequestMethod.GET)
	public String savePlant(@RequestParam Map<String,String> requestParams, Plant plant) {
		int i = 1 + 1;
		return "addplant";
	}

}
