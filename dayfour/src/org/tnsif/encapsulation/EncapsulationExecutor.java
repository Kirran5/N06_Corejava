package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC h=new  HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(1829793718977L);
		h.setAtmCardNo(1763565474545L);
		h.setPinNo(1221);
		
		
		System.out.println("account No.is: "+h.getAccountNo());
		//below line will call to toString() method
		//System.out.println(h);

	}

}
