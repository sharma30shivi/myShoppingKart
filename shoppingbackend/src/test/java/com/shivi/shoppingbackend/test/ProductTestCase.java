/*package com.shivi.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.shivi.shoppingbackend.dao.ProductDAO;
import com.shivi.shoppingbackend.dto.Product;

public class ProductTestCase {

private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init(){
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shivi.shoppingbackend");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	
	@Test
	public void testCRUDProduct(){
		
		//add Operation
		product = new Product();
		product.setName("Oppo Selife S53");
		product.setBrand("Oppo");
		product.setDescription("This is some description for Oppo Mobile");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		assertEquals("Something went wrong whiole adding the product", 
				true,productDAO.add(product));
		
		//reading and updating the catehroy
		
		product = productDAO.get(2);
		product.setName("Samsung Galaxy S7");
		assertEquals("Something went wrong whiole upadting the product", 
				true,productDAO.update(product));
		
		//deleting the category
		category= categoryDAO.get(2);
				
		
		assertEquals("successfully deleted a single  category in the product", true, productDAO.delete(product));
		//getting the list of category
		assertEquals("successfully fetched the listof categories from table", 6, productDAO.list().size());		
		
	}
	
	
	@Test
	public void testListActiveProducts(){
		assertEquals("successfully fetched the listof categories from table", 5, productDAO.listActiveProducts().size());		
		
	}
	@Test
	public void testListActiveProductsByCategory(){
		assertEquals("successfully fetched the listof categories from table", 3, productDAO.listActiveProductsByCategory(3).size());		
		assertEquals("successfully fetched the listof categories from table", 2, productDAO.listActiveProductsByCategory(1).size());
	}
	@Test
	public void testGetLatestActiveProducts(){
		assertEquals("successfully fetched the listof categories from table", 3, productDAO.getLatestActiveProducts(3).size());		
			}
}
*/