package de.unistuttgart.vis.dsass2021.ex00.p1;

public interface ICalculator {
	
	
	/** Returns a+b */
	public int add(int a, int b);

	/** Returns a*b */
	public int mult(int a, int b);

	/** Returns maximum of a and b */
	public int max(int a, int b);

	/**
	 * Calculates digit sum (Quersumme) 
	 * for natural numbers including 0
	 */
	public int digitSum(int a);

}

	

