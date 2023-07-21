//program to demonstrate on ternary Operators

package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("Result is: "+result);
		s.close();

	}

}
