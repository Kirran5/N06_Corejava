package org.tnsif.interfacedemo;
//program to demonstrate an interface
public interface Sony {
	
	int  noOfChannel=6;
	//by default all the method inside an interface is an abstract method
	void display();
	/*java 8 provides a static and default method inside an interface*/
	//Static method
	static void accept()
	{
		System.out.println("Static method");
	}
	//Default method
	default void show()	
	{
		System.out.println("Default method");
	}

}
