package org.tnsif.interfacedemo;

public class Human implements ColdDrinks,AlcoholDrinks{

	@Override
	public void showDrinks() {
		System.out.println(ColdDrinkName+" "+AlcoholDrinkName+" "+brand);
		
	}

}
