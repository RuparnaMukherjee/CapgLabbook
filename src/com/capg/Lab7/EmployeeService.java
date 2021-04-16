package com.capg.Lab7;

interface EmployeeServiceInterface {
	public void insuranceScheme(int id,int salary,String name,String designation);
}

public class EmployeeService implements EmployeeServiceInterface{

	String scheme;
	@Override
	public void insuranceScheme(int id, int salary, String name, String designation) {
		// TODO Auto-generated method stub
		if((salary>5000 && salary<20000) && designation.equalsIgnoreCase("System Associate"))
			scheme="Scheme C";
		if((salary>=20000 && salary<40000) && designation.equalsIgnoreCase("Programmer"))
			scheme="Scheme B";
		if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
			scheme="Scheme A";
		if(salary>=5000 && designation.equalsIgnoreCase("Clerk"))
			scheme="No Scheme";
		Employee employee=new Employee();
		employee.setDesignation(designation);
		employee.setId(id);
		employee.setInsuranceScheme(scheme);
		employee.setName(name);
		employee.setSalary(salary);
		EmployeeDao employeedao=new EmployeeDao();
		employeedao.addEmployeeDetails(employee);
		
	}
	
}
