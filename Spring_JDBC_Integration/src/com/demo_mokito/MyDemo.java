package com.demo_mokito;

import java.util.List;
import java.util.stream.Collectors;

public class MyDemo {

	MyInterface obj;

	public MyDemo(MyInterface obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	public List<String> findAllProjects(String empName) {
		return obj.findAllProjects(empName).stream().filter(n -> {
			return n.length() > 5;
		}).collect(Collectors.toList());

	}

	public void deleteProjectData(String name) {
		List<String> projects = obj.findAllProjects(name);

		for (String n : projects) {
			if (n.equals("found"))
				obj.deleteProject(name);
		}
	}

}

