package org.tnsif.operators;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=23 , y=6;
		int res1=x++ + ++y; //23 +7
		System.out.println(res1);
		System.out.println(x);//24
		System.out.println(y);//7
		System.out.println("result2:");
		int res2=x-- + --y;
		System.out.println(res2);//24 +6//30
		System.out.println(x);//23
		System.out.println(y);//6

	}

}
