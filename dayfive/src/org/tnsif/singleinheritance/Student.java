package org.tnsif.singleinheritance;

public class Student extends Citizen {
	
	private int rollNo;
	private String collegeName;
	
	//getter and setters
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	//parameterized constructor
	public Student(String city, int pincode, String area, long adharNo,
			int rollNo,String collegeName) {
		super(city, pincode, area, adharNo);
        this.rollNo=rollNo;
        this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
