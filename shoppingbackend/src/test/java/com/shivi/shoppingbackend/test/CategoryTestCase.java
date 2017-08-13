package com.shivi.shoppingbackend.test;



import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shivi.shoppingbackend.dao.CategoryDAO;
import com.shivi.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shivi.shoppingbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
/*	@Test
	public void testAddCategory(){
		
		category = new Category();
		
		category.setName("Mobile");
		category.setDescription("This is description for mobile");
		category.setImageUrl("CAT_190.png");
		
		
		assertEquals("successfully added a category inside the table", true, categoryDAO.add(category));
	}*/
	
	/*@Test
	public void testGetCategory(){
		
		category= categoryDAO.get(3);
		
		assertEquals("successfully fetched a single  category from the table", "Mobile", category.getName());		
		
	}*/
	
/*	@Test
	public void testUpdateCategory(){
		
		category= categoryDAO.get(3);
		category.setName("Phone");
		
		assertEquals("successfully update a single  category in the table", true, categoryDAO.update(category));		
		
	}
	*/
/*		@Test
	public void testDeleteCategory(){
		
		category= categoryDAO.get(3);
		
		assertEquals("successfully deleted a single  category in the table", true, categoryDAO.delete(category));		
		
	}
	*/
	/*	@Test
	public void testListCategory(){
		
		
		assertEquals("successfully fetched the listof categories from table", 2, categoryDAO.list().size());		
		
	}*/
	
	@Test
	public void testCRUDCategory(){
		
		//add Operation
		category = new Category();
		category.setName("Laptop");
		category.setDescription("This is description for laptop");
		category.setImageUrl("CAT_1.png");
		assertEquals("successfully added a category inside the table", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("TV");
		category.setDescription("This is description for televison");
		category.setImageUrl("CAT_2.png");
		assertEquals("successfully added a category inside the table", true, categoryDAO.add(category));
		
		category = new Category();
		category.setName("Mobile");
		category.setDescription("This is description for mobile");
		category.setImageUrl("CAT_3.png");
		assertEquals("successfully added a category inside the table", true, categoryDAO.add(category));
		
		//fetching and updating the category 
		category= categoryDAO.get(2);
		category.setName("Televison");
		
		/*//deleting the category
		category= categoryDAO.get(2);
		assertEquals("successfully deleted a single  category in the table", true, categoryDAO.delete(category));		
		*/
		//getting the list of category
		assertEquals("successfully fetched the listof categories from table", 6, categoryDAO.list().size());		
		
	}
	
	

}
