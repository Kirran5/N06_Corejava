//program to demonstrate on
//this keyword is used to refer current instance of the class

package org.tnsif.thiskeyworddemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}
//driver class
public class ThiskeywordDemoOne {

	public static void main(String[] args) {
		Account a=new Account();
		//a.accountNo=64456787654L;
		a.setData(654345673L);
		a.display();
	}

}
