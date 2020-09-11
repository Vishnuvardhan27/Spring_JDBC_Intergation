package com.test;

import static org.junit.Assert.*;

import javax.swing.Spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dao.EmployeeDAO;
import com.pojo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestEmployeeDAOJdbc_Templete_Context {

	@Autowired
	@Qualifier(value="template")
	EmployeeDAO dao;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		dao=null;
	}

	@Test
	public void testAddEmployee() {
		//fail("Not yet implemented");
		Employee emp = new Employee(556, 10000, "name", "technoogy");
		
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
