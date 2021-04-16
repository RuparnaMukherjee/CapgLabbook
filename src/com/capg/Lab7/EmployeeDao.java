package com.capg.Lab7;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeDao {

	void addEmployeeDetails(Employee employee) {
		HashMap employeelist=new HashMap();
		
		ArrayList employeedets=new ArrayList();
		employeedets.add(employee.getName());
		employeedets.add(employee.getDesignation());
		employeedets.add(employee.getSalary());
		employeedets.add(employee.getInsuranceScheme());
		
		employeelist.put(employee.getId(),employeedets);
		System.out.println("Employee Id:"+employee.getId());
		System.out.println("Employee name:"+employee.getName());
		System.out.println("Employee designation:"+employee.getDesignation());
		System.out.println("Employee salary:"+employee.getSalary());
		System.out.println("Employee Insurance Scheme:"+employee.getInsuranceScheme());
		
	}
}
