package com.Array;

public class MultiDimensionalArray {
		public static void main(String[] args) {
		
		// dataType arrayName[][] = new dataType[size][size];
		
		String liveTech[][] = new String[2][2];
		
		liveTech[0][0]="Venkat Sir";
		liveTech[0][1]="Manual Testing";
		
		liveTech[1][0] = "Srini";
		liveTech[1][1] = "Selenium";
				
		//System.out.println(liveTech[1][1]);
		
		for(int rowIndex=0;rowIndex<=1;rowIndex++) // goto every Row
		{
			// In very Row - should goto all the columns
			for(int rowOfColumnIndex=0;rowOfColumnIndex<=1;rowOfColumnIndex++)
			{
				System.out.print(liveTech[rowIndex][rowOfColumnIndex]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
