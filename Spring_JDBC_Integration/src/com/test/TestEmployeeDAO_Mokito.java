package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dao.EmployeeDAO_jdbcTemplate;
import com.pojo.Employee;
import static org.mockito.BDDMockito.given;  

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeDAO_Mokito {

	@Mock
	EmployeeDAO_jdbcTemplate emp_jdbc;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test_NotNull()
	{
		assertNotNull(emp_jdbc);
	}
	
	
	
	@Test
	public void testAddEmployee_stub()
	{
		Employee e= new Employee();
		when(emp_jdbc.addEmployee(e)).thenReturn(10);
		
		assertEquals(10, emp_jdbc.addEmployee(e));
		
	}
	
	@Test
	public void testAddEmployee_verify() {

		Employee e=new Employee();
		when(emp_jdbc.addEmployee(e)).thenReturn(10);

		verify(emp_jdbc,never()).addEmployee(e);
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddEmployee1() {
		fail("Not yet implemented");
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
