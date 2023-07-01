import java.util.ArrayList;
import java.util.Arrays;

public class LinAlgebra {

	//method for multiplying a row of input data pairwise for the 
	//weights for that row of input data, and then summing it up + bias.
	/*public static double[] pairWiseMult(double[][] input, double[][] weights, double [] bias)
	{
		//array list for the output
		double [] output = new double[weights.length];
		double val = 0;
		
		for (int row = 0; row < input.length; row++ )
		{
			for (int col = 0; col < input[0].length; col++)
			{
				val = val + input[row][col] * weights[row][col]+ bias[row];
			}
			output[row] = val;
			val = 0;
		}
		
		return output;
	}*/
	
	public static double oneDimMult (double[] x, double [] weights, double bias)
	{
		double output = 0;
		for (int col = 0; col < x.length; col++ )
		{
			output = output + x[col] * weights[col];
		}
		output = output + bias;
		return output;
	}
	
	
}
