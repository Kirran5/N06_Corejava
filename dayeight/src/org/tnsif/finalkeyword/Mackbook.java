package org.tnsif.finalkeyword;

public class Mackbook extends Laptop {
		
		final String PROCESSOR="M1 chip";
		//final method
		/*we can't override final method*/
		//void display()
		{
			//System.out.println(PROCESSOR);
		}
		void display(String PROCESSOR)
		{
			System.out.println(PROCESSOR);
		}
		

}
