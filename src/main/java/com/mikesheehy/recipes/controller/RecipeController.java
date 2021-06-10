package com.mikesheehy.recipes.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mikesheehy.recipes.data.RecipeRepository;
import com.mikesheehy.recipes.model.Recipe;

@Controller
public class RecipeController {
	@Autowired
	private RecipeRepository recipeRepository;
	
	@RequestMapping ("/")
	public String listRecipes() {
		return "home";
	}
	// URL => localhost:8080/recipe/nachos
	@RequestMapping ("/recipe/{name}")
	public String recipeDetails(@PathVariable String name, ModelMap modelMap) {
		Recipe recipe = recipeRepository.findByName(name);
		modelMap.put("recipe",recipe);
		return "recipe-details";
	}
}
