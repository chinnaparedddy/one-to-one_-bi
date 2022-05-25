package com.ty.onetoonebi.controler;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;


public class TestDeletePanPerson {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Pan pan=entityManager.find(Pan.class,2);		
		Person person=pan.getPerson();
		
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(pan);
		entityTransaction.commit();
	}
}
