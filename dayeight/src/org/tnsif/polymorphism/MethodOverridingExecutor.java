package org.tnsif.polymorphism;
class ChiefMinister
{
	static void corruption(String str1 , float amount1)
	{
		System.out.println(str1+" corrupted the amount of "+amount1);
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2 , float amount2)
	{
		ChiefMinister.corruption("Eknath Shinde",6767675.5f);
		System.out.println(str2+" corrupted the amount of "+amount2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA.corruption("pratik gawali",70000000.0f);

	}

}
