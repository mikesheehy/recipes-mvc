package com.mikesheehy.recipes.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mikesheehy.recipes.model.Category;

@Component
public class CategoryRepository {
	//This will be replaced by database
	private static final List<Category> ALL_CATEGORIES = Arrays.asList(
			new Category(1, "Appetizer"),
			new Category(2, "Breakfast"),
			new Category(3, "Dinner")
			);

	public Category findById(int id){
		for(Category category : ALL_CATEGORIES){
			if(category.getId() == id){
				return category;
			}
		}
		return null;
	}

	public List<Category> getAllCategories(){
		return ALL_CATEGORIES;
	}
	
}
