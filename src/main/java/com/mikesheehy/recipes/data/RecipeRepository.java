package com.mikesheehy.recipes.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mikesheehy.recipes.model.Recipe;

@Component
public class RecipeRepository {
	//This will be replaced by database
	private static final List<Recipe> ALL_RECIPES = Arrays.asList(
			new Recipe("nachos", LocalDate.of(2021,3,15), "Mike Sheehy", true),
			new Recipe("chicken-parm", LocalDate.of(2021,3,8), "Mike Sheehy", true),
			new Recipe("cubano", LocalDate.of(2021,3,1), "Mike Sheehy", false),
			new Recipe("guacamole", LocalDate.of(2021,2,22), "Mike Sheehy", true),
			new Recipe("jambalaya", LocalDate.of(2021,2,1), "Mike Sheehy", false),
			new Recipe("biscuits-gravy", LocalDate.of(2021,2,15), "Mike Sheehy", true)
			);
	
	public Recipe findByName(String name) {
		for(Recipe recipe : ALL_RECIPES) {
			if(recipe.getName().equals(name)) {
				return recipe;
			}
		}
		return null;
	}
	
}
