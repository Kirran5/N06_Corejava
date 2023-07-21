//program to demonstrate on Arithmetic Operators
package org.tnsif.operators;

import java.util.Scanner;

public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			int num1=s.nextInt();
			int num2=s.nextInt();
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num1%num2);
		}
		

	}

}
