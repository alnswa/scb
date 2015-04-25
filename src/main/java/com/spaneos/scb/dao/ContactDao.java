package com.spaneos.scb.dao;

import java.util.List;

import com.spaneos.scb.pojo.Employee;

public interface ContactDao {
	boolean createNewEmployee(Employee employee);

	boolean deleteEmployee(int cid);

	Employee getEmployee(int cid);

	boolean updateEmployee(Employee employee);

	List<Employee> getEmployeeList();

	List<Employee> getEmployee(String name);

}