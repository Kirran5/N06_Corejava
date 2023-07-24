//program to demonstrate on SwitchExecutor

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choise=s.nextInt();
		switch(choise)
		{
			case 1:
				System.out.println("Waka Waka");
				break;
			case 2:
				System.out.println("Taki Taki");
				break;
			case 3:
				System.out.println("Jai shree Ram");
				break;
			default:
				System.out.println("Invalid Input");
			
		}

	}

}
