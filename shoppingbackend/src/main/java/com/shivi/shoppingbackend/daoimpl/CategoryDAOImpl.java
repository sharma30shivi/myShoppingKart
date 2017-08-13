package com.shivi.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shivi.shoppingbackend.dao.CategoryDAO;
import com.shivi.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new 
			ArrayList<>();
	static{
		Category category = new Category();
		
		//Adding first Category
		
		category.setId(1);
		category.setName("Televison");
		category.setDescription("This is description for televison");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description for mobile");
		category.setImageUrl("CAT_2.png");
		
		categories.add(category);
		
		//third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description for laptop");
		category.setImageUrl("CAT_3.png");
				
				categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// for each loop
		
		for(Category category:categories){
			if(category.getId() == id){
				return category;
			}
		}
		return null;
	}

}
