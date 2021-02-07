package com.mikesheehy.recipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecipeController {
	@RequestMapping ("/")
	public String listRecipes() {
		return "home";
	}
}
