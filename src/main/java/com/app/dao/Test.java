package com.app.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
EmployeeDao dao=(EmployeeDao)context.getBean(EmployeeDao.class);
boolean b=dao.saveEmployee(new Employee(1,"kuppaiah",98989.90f));
System.out.println(b);
List<Employee> e=dao.getAllEmployee();
for(Employee ee:e)
{
	System.out.println(ee);
}
	}

}
