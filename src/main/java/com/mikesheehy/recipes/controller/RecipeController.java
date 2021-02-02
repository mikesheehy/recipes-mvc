package com.mikesheehy.recipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {
	@RequestMapping ("/")
	@ResponseBody
	public String listRecipes() {
		return "List of all recipes";
	}
}
