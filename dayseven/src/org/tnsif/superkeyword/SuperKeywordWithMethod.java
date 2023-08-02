package org.tnsif.superkeyword;
class MET{
	 
	 String ownerName="Chagan Bhujal";
	 void displayName()
	 {
		 System.out.println("Owner is: "+ownerName);
	 }
}
//child class
class BKC extends MET{
	
	String ownerName="Shefali Bhujal";
	 void displayName()
	 {
		 /*if parent class and child class method name are same,
		  * and if you want to access that method inside
		  * child class,then use
		  * super.methodname();*/
		 super.displayName();
		 System.out.println("Owner is: "+ownerName);
	 }
	
}
//driver class
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b=new BKC();
		b.displayName();
		

	}

}
