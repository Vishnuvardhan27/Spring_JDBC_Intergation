package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.pojo.Employee;

public class TestEmployeeDAOJdbc_Templete {

	EmployeeDAO dao;
	@Before
	public void setUp() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		dao =(EmployeeDAO) context.getBean("template");
		
	}

	@After
	public void tearDown() throws Exception {
		dao=null;
	}

	@Test
	public void testAddEmployee() {
		//fail("Not yet implemented");
		Employee emp = new Employee(555, 10000, "name", "technoogy");
		
		int added = dao.addEmployee(emp);
		assertEquals(1, added);
		
	}

	@Test
	public void testAddEmployee1() {
		//fail("Not yet implemented");
		
	}

	@Test
	public void testUpdateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindEmployeeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllEMployees() {
		fail("Not yet implemented");
	}

}
