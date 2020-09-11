package com.demo_mokito;

import java.util.List;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public List<String> findAllProjects(String empName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(String name) {
		// TODO Auto-generated method stub
		System.out.println("deleted project:-"+name);
	}

}