package com.app.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
EmployeeDao dao=(EmployeeDao)context.getBean(EmployeeDao.class);
/*int status=dao.saveemployee(new Employee(1,"kuppaiah",8900.9f));
System.out.println(status);*/

/*EmployeeDao dao=(EmployeeDao)context.getBean(EmployeeDao.class);
int status=dao.updateEmployee(new Employee(1,"kuppaiah",8900.9f));
System.out.println(status);*/
Employee e=new Employee();
e.setId(1);
int n=dao.deleteEmployee(e);
System.out.println(n);
	}

}
