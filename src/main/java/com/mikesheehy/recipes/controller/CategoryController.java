package com.mikesheehy.recipes.controller;

import java.util.List;

import com.mikesheehy.recipes.data.CategoryRepository;
import com.mikesheehy.recipes.data.RecipeRepository;
import com.mikesheehy.recipes.model.Category;
import com.mikesheehy.recipes.model.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private RecipeRepository recipeRepository;
	
	@RequestMapping ("/categories")
	public String listCategories(ModelMap modelMap) {
		List<Category> allCategories = categoryRepository.getAllCategories();
		modelMap.put("categories", allCategories);
		return "categories";
	}

	@RequestMapping("/category/{id}")
	public String category(@PathVariable int id, ModelMap modelMap) {
		Category category = categoryRepository.findById(id);
		modelMap.put("category", category);

		List<Recipe> recipes = recipeRepository.findByCategoryId(id);
		modelMap.put("recipes", recipes);
		return "category";
	}
	
}
