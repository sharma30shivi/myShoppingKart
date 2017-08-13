package com.shivi.shoppingbackend.dao;

import java.util.List;

import com.shivi.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
}
