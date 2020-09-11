package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demo_mokito.MyDemo;
import com.demo_mokito.MyInterface;
import com.demo_mokito.MyInterfaceImpl;
import static org.mockito.BDDMockito.given;  

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



public class TestMyDemo_Mockito {

	
	
	@Test
	public void testusing_Mocks() {
		MyInterface m = mock(MyInterfaceImpl.class);

		List<String> names = Arrays.asList("hello", "xyz", "one_two", "rty yut", "fgt", "ght ghjsdjs");
		when(m.findAllProjects("one")).thenReturn(names);//thenCallRealMethod();

		MyDemo demo = new MyDemo(m);
		List<String> result = demo.findAllProjects("one");
		assertEquals(3, result.size());
	}

	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMyDemo() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllProjects() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProjectData() {
		fail("Not yet implemented");
	}

}
