package org.tnsif.instanceofdemo;
class RBI
{
	protected String ifscCode="RBISONGPA01";
}
class SBI extends RBI
{
	public SBI() {
	super.ifscCode="RBISONGPA01";
	String ifscCode="SBIN0002161";
	System.out.println(ifscCode);
	/*if parent class and child class variable name is same,
	 * in such case, use super.variablename to access that
	 * variable of parent class inside the child class */
	System.out.println(super.ifscCode);
	}
	
}
//program to demonstrate on instanceOf operator
public class InstanceofDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		System.out.println(s instanceof SBI );
		System.out.println(s instanceof RBI );
	}

}
