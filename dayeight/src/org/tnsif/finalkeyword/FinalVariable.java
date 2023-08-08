package org.tnsif.finalkeyword;

public class FinalVariable {
	
	/*final variable must be initialize during deceleration*/
	//final int x;
	
	final float SALARY=750000.50f;
	
	void print()
	{
		/*we can't change the value of final variable*/
		//SALARY=850000.50f;
		System.out.println("Salary is: "+SALARY);
	}

}
