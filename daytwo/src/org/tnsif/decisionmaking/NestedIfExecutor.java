//program to demonstrate on NestedIfExecutor

package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfExecutor {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			int age=s.nextInt();
			int weight=s.nextInt();
			if(age>=12)
			{
				if(weight>=40)
				{
					System.out.println("Eligible for bunjee jumping");
					if(weight>110)
					{
						System.out.println("Extra ropes will be added");
					}
				}
				else {
					System.out.println("you are not eligible");
				}
			}
			else {
				System.out.println("you are very small to bunjee jumping please try later");
					
				}
			}
		
	}

}
