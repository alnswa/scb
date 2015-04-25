package com.spaneos.scb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spaneos.scb.pojo.Employee;
@Repository
public class ContactDaoImp implements ContactDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public boolean createNewEmployee(Employee Employee) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(Employee);
		tx.commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteEmployee(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployee(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}