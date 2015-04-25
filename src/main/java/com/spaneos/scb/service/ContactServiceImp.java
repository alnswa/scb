package com.spaneos.scb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaneos.scb.dao.ContactDao;
import com.spaneos.scb.pojo.Employee;
@Service
public class ContactServiceImp implements ContactService{
	@Autowired
	private ContactDao contactDao;

	@Override
	public boolean createNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
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

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	
	
}