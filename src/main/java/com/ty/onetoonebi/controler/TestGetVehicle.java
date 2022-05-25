package com.ty.onetoonebi.controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Vehicle;


public class TestGetVehicle {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class,1);
		System.err.println(vehicle);
	}
}

