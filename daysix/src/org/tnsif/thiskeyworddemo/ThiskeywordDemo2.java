package org.tnsif.thiskeyworddemo;


class Bank
{
	long accountNo;
	Bank(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThiskeywordDemo2 {	

	public static void main(String[] args) {
		Bank b=new Bank(765432345);
		b.display();

	}
}
