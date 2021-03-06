package com.shivi.shoppingbackend.daoimpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shivi.shoppingbackend.dao.CategoryDAO;
import com.shivi.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired 
	private SessionFactory sessionFactory; 
	
	
	
	@Override
	public List<Category> list() {
	
		//HQL passing parameter
		String selectActiveCategory = "FROM Category where active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		
		return query.getResultList();
	}


	/**
	 Getting single category based on id
	 */
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override

	public boolean add(Category category) {
			//add category to the database table
			try{
				sessionFactory.getCurrentSession().persist(category);
				return true;
			}
			catch(Exception e){
			e.printStackTrace();
				return false;
				}

	}

	/*
	 * Updating a single category*/
	@Override
	public boolean update(Category category) {
		//add category to the database table
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e){
		e.printStackTrace();
			return false;
			}
	}

	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e){
		e.printStackTrace();
			return false;
			}
	}

}
