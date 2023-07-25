package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		
		//object creation
		Employee e=new Employee();
		e.empID=132981;
		e.empName="Kiran Shinde";
		e.salary=850000;
		e.department="comp";
		//method call
		e.display();

	}

}
