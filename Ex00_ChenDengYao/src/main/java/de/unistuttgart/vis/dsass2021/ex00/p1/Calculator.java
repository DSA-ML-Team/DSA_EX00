package de.unistuttgart.vis.dsass2021.ex00.p1;


public class Calculator implements ICalculator {
	@Override
	public int add(int a, int b ) {
		int results = a + b ;
		return results ;
		
	}
	
	@Override
	public int mult(int a, int b) {
		int results = a*b;
		return results; 
	}
	
	@Override
	public int max(int a, int b) {
		int results = 0 ;
		if (a >= b)
		{
			results = a;
		}
		else if (a < b  ) 
		{
			results = b;
		}
		
		return results;
	}	
	
	@Override
	public int digitSum(int a) {
        int sum = 0;
        int scaleOf = 0;
        for (int i = 0; a / ((int)Math.pow(10, i)) != 0; i++) {
            scaleOf = i;
        }
        int temp = a;
        for(int j = scaleOf; j > -1 ; j--) {
            sum = sum + (temp/ ( (int)Math.pow(10, j)));

            temp = temp % ((int)Math.pow(10, j));
        }
        return sum; 
	}	 
	
 
	
}
	